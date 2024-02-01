package creationalFactoryMethod.factories;

import creationalFactoryMethod.shoes.NikeRunningShoe;
import creationalFactoryMethod.shoes.RunningShoe;

public class NikeShoeFactory implements ShoeFactory {
    @Override
    public RunningShoe createRunningShoe(){
        return new NikeRunningShoe();
    }
}
