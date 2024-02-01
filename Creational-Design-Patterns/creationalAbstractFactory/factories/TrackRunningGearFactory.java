package creationalAbstractFactory.factories;

import creationalAbstractFactory.shoes.RunningShoe;
import creationalAbstractFactory.watches.RunningWatch;
import creationalAbstractFactory.shoes.TrackRunningShoe;
import creationalAbstractFactory.watches.TrackRunningWatch;

public class TrackRunningGearFactory implements RunningGearFactory {
    @Override
    public RunningWatch createWatch(){
        return new TrackRunningWatch();
    }
    @Override
    public RunningShoe createShoe(){
        return new TrackRunningShoe();
    }
}
