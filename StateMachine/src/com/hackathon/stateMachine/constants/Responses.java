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

    public static final String[] shameResponseArray = new String[]{"That sounds a little embarrassing",
            "Embarrassment can be a powerful emotion", "Sound's like you're having a very emotional experience"};

    public static final String[] supriseResponseArray = new String[]{"Wow! That's very surprising",
            "Sounds like you're a little surprised", "Wow!"};

    public static final String[] calmnessResponseArray = new String[]{"Sounds like you've got everything under control",
            "Interesting....", "You seem pretty calm about this."};

    public static final String[] agitationResponseArray = new String[]{"Sounds like a stressful situation, but I trust you'll make the right decision",
            "Hmm, I would be stressed too."};

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

    public static String getShameResponse(){
        return shameResponseArray[random.nextInt(shameResponseArray.length)];
    }
    public static String getSupriseResponse() {
        return supriseResponseArray[random.nextInt(supriseResponseArray.length)];
    }

    public static String getCalmnessResponse() {
        return calmnessResponseArray[random.nextInt(calmnessResponseArray.length)];
    }

    public static String getAgitationResponse() {
        return agitationResponseArray[random.nextInt(agitationResponseArray.length)];
    }
}
