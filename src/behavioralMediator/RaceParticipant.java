package behavioralMediator;

public interface RaceParticipant {
    void updateStatus(String status);
    void receiveStatusUpdate(String status);
    String getName();
}
