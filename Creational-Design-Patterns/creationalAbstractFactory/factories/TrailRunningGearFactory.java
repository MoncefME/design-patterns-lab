package creationalAbstractFactory.factories;

import creationalAbstractFactory.RunningGearFactory;
import creationalAbstractFactory.RunningShoe;
import creationalAbstractFactory.RunningWatch;
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
