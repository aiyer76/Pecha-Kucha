package com.hackathon.stateMachine.context;

import com.hackathon.stateMachine.androidAppDummy.AndroidChatApp;
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
            public URL getURL(String sentiment) {
                return null;
            }
        };
    }

    @Override
    public AndroidChatApp buildAndroidChatApp() {
        return null;
    }

    @Override
    public ResponseGenerator buildResponseGenerator() {
        return null;
    }
}
