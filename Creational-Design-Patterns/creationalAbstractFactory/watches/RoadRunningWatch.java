package creationalAbstractFactory.watches;

public class RoadRunningWatch implements RunningWatch {
    @Override
    public void trackRun(){
        System.out.println("Tracking run on road using Apple Watch Series 5");
    }
}
