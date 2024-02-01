package creationalAbstractFactory;

import creationalAbstractFactory.factories.RoadRunningGearFactory;
import creationalAbstractFactory.factories.TrackRunningGearFactory;
import creationalAbstractFactory.factories.TrailRunningGearFactory;

public class Main {
    public static void main(String[] args) {

    RunningGearFactory trailRunningGearFactory = new TrailRunningGearFactory();
    RunningShoe trailRunningShoe = trailRunningGearFactory.createShoe();
    RunningWatch trailRunningWatch = trailRunningGearFactory.createWatch();
    trailRunningShoe.run();
    trailRunningWatch.trackRun();

    System.out.println("---------------------");

    RunningGearFactory roadRunningGearFactory = new RoadRunningGearFactory();
    RunningShoe roadRunningShoe = roadRunningGearFactory.createShoe();
    RunningWatch roadRunningWatch = roadRunningGearFactory.createWatch();
    roadRunningShoe.run();
    roadRunningWatch.trackRun();

    System.out.println("---------------------");

    RunningGearFactory trackRunningGearFactory = new TrackRunningGearFactory();
    RunningShoe trackRunningShoe = trackRunningGearFactory.createShoe();
    RunningWatch trackRunningWatch = trackRunningGearFactory.createWatch();
    trackRunningShoe.run();
    trackRunningWatch.trackRun();

    }
}
