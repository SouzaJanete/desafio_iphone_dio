// AparelhoTelefonico.java
public interface AparelhoTelefonico {
    void call(String phoneNumber);
    void answer();
    void hangUp();
    void sendSMS(String phoneNumber, String message);
}
