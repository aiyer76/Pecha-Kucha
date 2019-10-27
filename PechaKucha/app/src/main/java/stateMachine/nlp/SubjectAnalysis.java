package stateMachine.nlp;

import com.paralleldots.paralleldots.App;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import stateMachine.nlp.SubjectIdentifier;

public class SubjectAnalysis implements SubjectIdentifier {
    private static final String key = "xHIpuPtc7o1qaeoOWYaWiPetLQxjQTNY4Sky7rX99fM";
    private static App pd = new App(key);
    private static String subject;
    private static int count;

    public String getSubject() {
        return this.subject;
    }

    public boolean hasSubject(String text) throws Exception {
        String keywords = pd.keywords(text);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject)parser.parse(keywords);
        JSONArray keywordList = (JSONArray) json.get("keywords");
        String trump = "";
        double maxVal = 0;
        boolean found = false;
        for(Object obj : keywordList) {
            JSONObject object = (JSONObject) obj;
            String keyword = (String) object.get("keyword");
            double confidence = (double) object.get("confidence_score");
            if ((++count < 2) && (confidence > maxVal)) {
                maxVal = confidence;
                trump = keyword;
                found = true;
            }
        }
        subject = trump;
        return found;
    }
}
