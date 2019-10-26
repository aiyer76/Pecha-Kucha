package com.hackathon.stateMachine;

import com.hackathon.stateMachine.androidAppDummy.AndroidChatApp;
import com.hackathon.stateMachine.constants.Responses;
import com.hackathon.stateMachine.context.ContextFactory;
import com.hackathon.stateMachine.nlp.SentimentIdentifier;
import com.hackathon.stateMachine.nlp.SubjectIdentifier;
import com.hackathon.stateMachine.responses.ResponseGenerator;
import com.hackathon.stateMachine.web.WebQuery;

import java.net.URL;

public class StateMachine {
    private static final ContextFactory builder = null;
    private int currentState = 0;
    private AndroidChatApp app = builder.buildAndroidChatApp();
    private SubjectIdentifier subjectIdentifier = builder.buildSubjectIdentifier();
    private SentimentIdentifier sentimentIdentifier = builder.buildSentimentIdentifier();
    private WebQuery webQuery =builder.buildWebQuery();
    private ResponseGenerator responseGenerator = builder.buildResponseGenerator();
    private String content;
    private String subject;
    private String sentiment;

    public void state() {
        while (true) {
            switch (currentState) {
                case 0:{
                    app.setMessage(Responses.getGreeting());
                    currentState = 1;
                    break;
                }
                case 1: {
                    content = app.getContent();
                    currentState = 2;
                    break;
                }
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
                    URL url = webQuery.getURL(sentiment);
                    app.setMessage(Responses.getPresentLink1() + sentiment + Responses.getPresentLink2() + url);
                    currentState = 6;
                    break;
                }

                case 4: {
                    app.setMessage(responseGenerator.getResponse(sentiment));
                    currentState = 1;
                    break;
                }
                case 6: {
                    app = builder.buildAndroidChatApp();
                    subjectIdentifier = builder.buildSubjectIdentifier();
                    sentimentIdentifier = builder.buildSentimentIdentifier();
                    webQuery = builder.buildWebQuery();
                    responseGenerator = builder.buildResponseGenerator();
                    currentState = 1;
                    break;
                }

            }
        }
    }
}
