package creationalAbstractFactory.factories;

import creationalAbstractFactory.shoes.RunningShoe;
import creationalAbstractFactory.watches.RunningWatch;

public interface RunningGearFactory {
    RunningWatch createWatch();
    RunningShoe createShoe();
}
