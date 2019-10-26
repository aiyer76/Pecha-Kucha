package com.hackathon.stateMachine.context;

import com.hackathon.stateMachine.androidAppDummy.AndroidChatApp;
import com.hackathon.stateMachine.nlp.SentimentIdentifier;
import com.hackathon.stateMachine.nlp.SubjectIdentifier;
import com.hackathon.stateMachine.responses.ResponseGenerator;
import com.hackathon.stateMachine.web.WebQuery;

public interface ContextFactory {
    SentimentIdentifier buildSentimentIdentifier();
    SubjectIdentifier buildSubjectIdentifier();
    WebQuery buildWebQuery();
    AndroidChatApp buildAndroidChatApp();
    ResponseGenerator buildResponseGenerator();

}
