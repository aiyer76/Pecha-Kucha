package com.hackathon.stateMachine.constants;

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

    private static final String[] shameResponseArray = new String[]{"That sounds a little embarrassing",
            "Embarrassment can be a powerful emotion", "Sound's like you're having a very emotional experience"};

    private static final String[] surpriseResponseArray = new String[]{"Wow! That's very surprising",
            "Sounds like you're a little surprised", "Wow!"};

    private static final String[] calmnessResponseArray = new String[]{"Sounds like you've got everything under control",
            "Interesting....", "You seem pretty calm about this."};

    private static final String[] agitationResponseArray = new String[]{"Sounds like a stressful situation, but I trust you'll make the right decision",
            "Hmm, I would be stressed too."};
    private static final String[] happyResponseArray = new String[]{"Sounds like you're having a good day!",
            "I'm glad you're happy!"};

    private static final String[] sadResponseArray = new String[]{"Sorry that you're feeling under the weather today.",
            "You seem sad; sorry you're not having a great day."};

    private static final String[] likeResponseArray = new String[]{"Glad you're pleased!", "Sounds like you like that!"};

    private static final String[] dislikeResponseArray = new String[]{"Sorry you're displeased.",
            "Sounds like you're not super pleased about that."};

    private static final String[] sureResponseArray = new String[]{"Sounds like you're confident about that!",
            "Sounds like you're very sure!", "I like your confidence!", "Sounds like you know what you're doing!"};

    private static final String[] unsureResponseArray = new String[]{"Are you sure about that?",
            "You don't sound so sure.", "Sounds like you're unsure about that."};

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
    public static String getSurpriseResponse() {
        return surpriseResponseArray[random.nextInt(surpriseResponseArray.length)];
    }

    public static String getCalmnessResponse() {
        return calmnessResponseArray[random.nextInt(calmnessResponseArray.length)];
    }

    public static String getAgitationResponse() {
        return agitationResponseArray[random.nextInt(agitationResponseArray.length)];
    }

    public static String getUnsureResponse() {
        return unsureResponseArray[random.nextInt(unsureResponseArray.length)];
    }
    public static String getSureResponse() {
        return sureResponseArray[random.nextInt(sureResponseArray.length)];
    }
    public static String getDislikeResponse() {
        return dislikeResponseArray[random.nextInt(dislikeResponseArray.length)];
    }
    public static String getLikeResponse() {
        return likeResponseArray[random.nextInt(likeResponseArray.length)];
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
