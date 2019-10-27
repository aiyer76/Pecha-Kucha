package stateMachine.constants;

import java.util.Random;

public class Responses {
    private static final Random random = new Random();

    private static final String greeting = "Welcome to MyCustomChatBot!";
    private static final String moreInfo = "Please tell me more.";
    private static final String presentLink1 = "I found some information on ";
    private static final String presentLink2 = " at the following link: ";


    private static final String defaultResponse = "I'm not sure what to make of that.";

    private static final String[] angerResponseArray = new String[]{"Sorry that you're feeling frustrated.",
            "Sounds like you have a right to be angry.","That does sound frustrating.",
            "Sounds like a rough situation.","That's a tough one."};

    private static final String[] fearResponseArray = new String[]{"That sounds scary", "Yikes",
            "I can see why you would be apprehensive", "Sounds like a scary situation to me"};

    private static final String[] excitedResponseArray = new String[]{"Wow! That's very surprising",
            "Sounds like you're excited", "Wow!"};

    private static final String[] happyResponseArray = new String[]{"Sounds like you're having a good day!",
            "I'm glad you're happy!"};

    private static final String[] sadResponseArray = new String[]{"Sorry that you're feeling under the weather today.",
            "You seem sad; sorry you're not having a great day."};

    private static final String[] boredResponseArray = new String[]{"Sorry you're bored.",
            "Sounds like you're not super excited about that."};

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

    public static String getFearResponse(){
        return fearResponseArray[random.nextInt(fearResponseArray.length)];
    }

    public static String getExcitedResponse() {
        return excitedResponseArray[random.nextInt(excitedResponseArray.length)];
    }

    public static String getBoredResponse() {
        return boredResponseArray[random.nextInt(boredResponseArray.length)];
    }
    public static String getSadResponse() {
        return sadResponseArray[random.nextInt(sadResponseArray.length)];
    }

    public static String getHappyResponse() {
        return happyResponseArray[random.nextInt(happyResponseArray.length)];
    }

    public static String getDefaultResponse() {
        return defaultResponse;
    }

}
