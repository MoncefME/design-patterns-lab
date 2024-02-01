package creationalAbstractFactory.watches;

import creationalAbstractFactory.RunningWatch;

public class TrailRunningWatch implements RunningWatch {
    @Override
    public void trackRun() {
        System.out.println("Tracking run on trail with Coros Apex Pro");
    }
}
