package creationalAbstractFactory.factories;

import creationalAbstractFactory.RunningGearFactory;
import creationalAbstractFactory.RunningShoe;
import creationalAbstractFactory.RunningWatch;
import creationalAbstractFactory.shoes.RoadRunningShoe;
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
