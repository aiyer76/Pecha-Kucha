package stateMachine.nlp;

public interface SubjectIdentifier {
    boolean hasSubject(String content) throws Exception;
    String getSubject();
}
