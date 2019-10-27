package stateMachine.nlp;

public interface SentimentIdentifier {

    String getSentiment(String content) throws Exception;
}
