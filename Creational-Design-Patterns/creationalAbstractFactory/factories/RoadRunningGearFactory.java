package creationalAbstractFactory.factories;

import creationalAbstractFactory.shoes.RunningShoe;
import creationalAbstractFactory.shoes.RoadRunningShoe;
import creationalAbstractFactory.watches.RunningWatch;
import creationalAbstractFactory.watches.RoadRunningWatch;

public class RoadRunningGearFactory implements RunningGearFactory {
    @Override
    public RunningWatch createWatch(){
        return new RoadRunningWatch();
    }
    @Override
    public RunningShoe createShoe(){
        return new RoadRunningShoe();
    }
}
