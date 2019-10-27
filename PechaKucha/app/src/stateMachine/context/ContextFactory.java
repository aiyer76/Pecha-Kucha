package stateMachine.context;

import stateMachine.androidAppDummy.AndroidChatApp;
import stateMachine.constants.Responses;
import stateMachine.nlp.SentimentIdentifier;
import stateMachine.nlp.SubjectIdentifier;
import stateMachine.responses.ResponseGenerator;
import stateMachine.web.WebQuery;

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
        return subject -> {
            String baseURL = "https://en.wikipedia.org/wiki/";
            try {
                return new URL(baseURL + subject);
            } catch(Exception e) {
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
        return sentiment -> {
            switch(sentiment.toLowerCase()){
                case "anger": return Responses.getAngerResponse();
                case "fear": return Responses.getFearResponse();
                case "shame": return Responses.getShameResponse();
                case "surprise": return Responses.getSurpriseResponse();
                case "calmness": return Responses.getCalmnessResponse();
                case "agitation": return Responses.getAgitationResponse();
                case "dislike": return Responses.getDislikeResponse();
                case "like": return Responses.getLikeResponse();
                case "sure": return Responses.getSureResponse();
                case "unsure": return Responses.getUnsureResponse();
                case "happy": return Responses.getHappyResponse();
                case "sad": return Responses.getSadResponse();
                default: return Responses.getDefaultResponse();
            }
        };
    }
}
