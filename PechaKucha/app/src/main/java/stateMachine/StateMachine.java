package stateMachine;

import stateMachine.androidAppDummy.AndroidChatApp;
import stateMachine.constants.Responses;
import stateMachine.context.ContextFactoryFramework;
import stateMachine.nlp.SentimentIdentifier;
import stateMachine.nlp.SubjectIdentifier;
import stateMachine.responses.ResponseGenerator;
import stateMachine.web.WebQuery;

import java.net.URL;

public class StateMachine {
    private static final ContextFactoryFramework builder = null;
    private int currentState = 2;
    private AndroidChatApp app = builder.buildAndroidChatApp();
    private SubjectIdentifier subjectIdentifier = builder.buildSubjectIdentifier();
    private SentimentIdentifier sentimentIdentifier = builder.buildSentimentIdentifier();
    private WebQuery webQuery =builder.buildWebQuery();
    private ResponseGenerator responseGenerator = builder.buildResponseGenerator();
    private String content;
    private String subject;
    private String sentiment;

    public String state(String input) throws Exception {

        content = input;
        while (true) {
            switch (currentState) {
                case 2: {
                    if (subjectIdentifier.hasSubject(content)){
                        subject = subjectIdentifier.getSubject();
                        currentState = 3;
                        break;
                    }
                    sentiment = sentimentIdentifier.getSentiment(content);
                    currentState = 4;
                    break;
                }

                case 3: {
                    URL url = webQuery.getURL(subject);
                    currentState = 6;
                    return Responses.getPresentLink1() + subject + Responses.getPresentLink2() + url;
                }

                case 4: {
                    currentState = 2;
                    return responseGenerator.getResponse(sentiment) + Responses.getMoreInfo();
                }

                case 6: {
                    app = builder.buildAndroidChatApp();
                    subjectIdentifier = builder.buildSubjectIdentifier();
                    sentimentIdentifier = builder.buildSentimentIdentifier();
                    webQuery = builder.buildWebQuery();
                    responseGenerator = builder.buildResponseGenerator();

                    currentState = 2;
                    break;
                }

            }
        }
    }
}
