package creationalAbstractFactory.watches;

public class TrackRunningWatch implements RunningWatch {
    @Override
    public void trackRun(){
        System.out.println("Tracking run with Garmin Forerunner 945");
    }
}
