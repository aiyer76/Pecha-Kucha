package com.hackathon.stateMachine.context;

import com.hackathon.stateMachine.androidAppDummy.AndroidChatApp;
import com.hackathon.stateMachine.constants.Responses;
import com.hackathon.stateMachine.nlp.SentimentIdentifier;
import com.hackathon.stateMachine.nlp.SubjectIdentifier;
import com.hackathon.stateMachine.responses.ResponseGenerator;
import com.hackathon.stateMachine.web.WebQuery;

import java.net.URL;

public class ContextFactory implements ContextFactoryFramework{

    @Override
    public SentimentIdentifier buildSentimentIdentifier() {
        return null;
    }

    @Override
    public SubjectIdentifier buildSubjectIdentifier() {
        return null;
    }

    @Override
    public WebQuery buildWebQuery() {
        return new WebQuery() {
            @Override
            public URL getURL(String subject) {
                String baseURL = "https://en.wikipedia.org/wiki/";
                try {
                    return new URL(baseURL + subject);
                } catch(Exception e) {
                    return null;
                }
            }
        };
    }

    @Override
    public AndroidChatApp buildAndroidChatApp() {
        return null;
    }

    @Override
    public ResponseGenerator buildResponseGenerator() {
        return new ResponseGenerator() {
            @Override
            public String getResponse(String sentiment) {
                switch(sentiment.toLowerCase()){
                    case "anger": return Responses.getAngerResponse();
                    case "fear": return Responses.getFearResponse();
                    case "shame": return Responses.getShameResponse();
                    case "surprise": return Responses.getSupriseResponse();
                    case "calmness": return Responses.getCalmnessResponse();
                    case "agitation": return Responses.getAgitationResponse();
                    default: return Responses.getDefaultResponse();
                }
            }
        };
    }
}
