package creationalAbstractFactory.factories;

import creationalAbstractFactory.shoes.RunningShoe;
import creationalAbstractFactory.watches.RunningWatch;
import creationalAbstractFactory.shoes.TrailRunningShoe;
import creationalAbstractFactory.watches.TrailRunningWatch;

public class TrailRunningGearFactory implements RunningGearFactory {
    @Override
    public RunningWatch createWatch(){
        return new TrailRunningWatch();
    }
    @Override
    public RunningShoe createShoe(){
        return new TrailRunningShoe();
    }
}
