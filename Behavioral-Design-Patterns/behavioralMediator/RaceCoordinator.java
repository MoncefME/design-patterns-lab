package behavioralMediator;

public interface RaceCoordinator {
    void notifyParticipantStatus(String status , RaceParticipant participant);

    void addParticipant(RaceParticipant participant);
}
