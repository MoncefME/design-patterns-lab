package behavioralMediator;

public class Runner implements RaceParticipant{
    private final String name;
    private final RaceCoordinator coordinator;

    public String getName(){
        return name;
    }

    public Runner(String name, RaceCoordinator coordinator){
        this.name = name;
        this.coordinator = coordinator;
    }

    @Override
    public void receiveStatusUpdate(String status) {
        System.out.println(this.name + " received status update: " + status);
    }

    @Override
    public void updateStatus(String status) {
        System.out.println(this.name +" updated status: " + status);
        coordinator.notifyParticipantStatus(status, this);
    }
}
