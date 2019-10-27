package com.hackathon.stateMachine.constants;

import java.util.Random;

public class AngerResponse {
    public static final String[] angerResponseArray = new String[]{"Sorry that you're feeling frustrated.",
            "Sounds like you have a right to be angry.","That does sound frustrating.",
            "Sounds like a rough situation.","That's a tough one."};

    public static Random random = new Random();

    public static String getAngerResponse(){
        return angerResponseArray[random.nextInt(5)];
    }
}
