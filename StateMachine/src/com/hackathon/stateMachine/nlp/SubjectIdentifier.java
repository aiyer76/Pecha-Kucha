package com.hackathon.stateMachine.nlp;

public interface SubjectIdentifier {
    boolean hasSubject(String content);
    String getSubject();
}
