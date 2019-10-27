package stateMachine.context;

import stateMachine.androidAppDummy.AndroidChatApp;
import stateMachine.nlp.SentimentIdentifier;
import stateMachine.nlp.SubjectIdentifier;
import stateMachine.responses.ResponseGenerator;
import stateMachine.web.WebQuery;

public interface ContextFactoryFramework {
    SentimentIdentifier buildSentimentIdentifier();
    SubjectIdentifier buildSubjectIdentifier();
    WebQuery buildWebQuery();
    AndroidChatApp buildAndroidChatApp();
    ResponseGenerator buildResponseGenerator();

}
