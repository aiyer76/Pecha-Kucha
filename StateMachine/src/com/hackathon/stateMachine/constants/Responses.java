package com.hackathon.stateMachine.constants;

import java.util.Random;

public class Responses {
    private static final Random random = new Random();

    private static final String greeting = "Welcome to MyCustomChatBot!";
    private static final String moreInfo = "Please tell me more.";
    private static final String presentLink1 = "I found some information on ";
    private static final String presentLink2 = " at the following link: ";

    public static final String[] angerResponseArray = new String[]{"Sorry that you're feeling frustrated.",
            "Sounds like you have a right to be angry.","That does sound frustrating.",
            "Sounds like a rough situation.","That's a tough one."};

    public static final String[] fearResponseArray = new String[]{"That sounds scary", "Yikes",
            "I can see why you would be apprehensive", "Sounds like a scary situation to me"};

    public static final String[] happyResponseArray = new String[]{"Sounds like you're having a good day!",
            "I'm glad you're happy!"}

    public static final String[] sadResponseArray = new String[]{"Sorry that you're feeling under the weather today.",
            "You seem sad; sorry you're not having a great day."}

    public static final String[] likeResponseArray = new String[]{"Glad you're pleased!", "Sounds like you like that!"}

    public static final String[] dislikeResponseArray = new String[]{"Sorry you're displeased.",
            "Sounds like you're not super pleased about that."}

    public static final String[] sureResponseArray = new String[]{"Sounds like you're confident about that!",
            "Sounds like you're very sure!", "I like your confidence!", "Sounds like you know what you're doing!"}

    public static final String[] unsureResponseArray = new String[]{"Are you sure about that?",
            "You don't sound so sure.", "Sounds like you're unsure about that."}

    public static String getGreeting() {
        return greeting;
    }

    public static String getMoreInfo() {
        return moreInfo;
    }

    public static String getPresentLink1() {
        return presentLink1;
    }

    public static String getPresentLink2() {
        return presentLink2;
    }

    public static String getAngerResponse(){
        return angerResponseArray[random.nextInt(angerResponseArray.length)];
    }


}
