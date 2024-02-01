package creationalAbstractFactory.shoes;

import creationalAbstractFactory.RunningShoe;

public class RoadRunningShoe implements RunningShoe {
    @Override
    public void run(){
        System.out.println("Running on the road using Nike Zoom Fly 3");
    }
}
