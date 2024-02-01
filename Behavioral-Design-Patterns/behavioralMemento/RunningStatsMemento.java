package behavioralMemento;

public class RunningStatsMemento {
    private int distanceCovered;
    private String location;

    public RunningStatsMemento(int distanceCovered , String location){
        this.distanceCovered = distanceCovered;
        this.location = location;
    }

    public int getDistanceCovered() {
        return distanceCovered;
    }

    public String getLocation() {
        return location;
    }
}
