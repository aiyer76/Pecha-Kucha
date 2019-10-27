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
        return new WebQuery() {
            @Override
            public URL getURL(String subject) {
                String baseURL = "https://en.wikipedia.org/wiki/";
                try {
                    return new URL(baseURL + subject);
                } catch (Exception e) {
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
                switch (sentiment.toLowerCase()) {
                    case "anger":
                        return Responses.getAngerResponse();
                    case "fear":
                        return Responses.getFearResponse();
                    case "excited":
                        return Responses.getExcitedResponse();
                    case "bored":
                        return Responses.getBoredResponse();
                    case "happy":
                        return Responses.getHappyResponse();
                    case "sad":
                        return Responses.getSadResponse();
                    default:
                        return Responses.getDefaultResponse();
                }
            }
        };
    }
}
