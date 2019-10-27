package stateMachine.nlp;

import com.paralleldots.paralleldots.App;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.HashMap;
import java.util.Iterator;

public class SentimentAnalysis implements SentimentIdentifier {
    private static final String key = "xHIpuPtc7o1qaeoOWYaWiPetLQxjQTNY4Sky7rX99fM";
    private static App pd = new App(key);
    private HashMap<String, Integer> map = new HashMap<>();

    public SentimentAnalysis() {
    }

    public String getSentiment(String text) throws Exception {
        String emotion = pd.emotion(text);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject)parser.parse(emotion);
        JSONObject emotionList = (JSONObject) json.get("emotion");
        String trump = "";
        double maxVal = 0;
        Iterator<String> keysItr = emotionList.keys();
        while(keysItr.hasNext()) {
            String feeling = keysItr.next();
            double confidence = (double) emotionList.get(feeling);
            if (confidence > maxVal) {
                maxVal = confidence;
                trump = feeling;
            }
        }
        return trump;
    }
}
