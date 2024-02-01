package behavioralMediator;

import java.util.ArrayList;
import java.util.List;

public class MarathonCoordinator implements RaceCoordinator{
    private final List<RaceParticipant> participants = new ArrayList<>();
    @Override
    public void notifyParticipantStatus(String status , RaceParticipant participant){
        for(RaceParticipant p : participants){
            if(p != participant){
                p.receiveStatusUpdate(status);
            }
        }
    }

    @Override
    public void addParticipant(RaceParticipant participant) {
        participants.add(participant);
    }
}
