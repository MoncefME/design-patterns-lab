package creationalFactoryMethod.factories;

import creationalFactoryMethod.shoes.AdidasRunningShoe;
import creationalFactoryMethod.shoes.RunningShoe;

public class AdidasShoeFactory implements ShoeFactory {
    @Override
    public RunningShoe createRunningShoe(){
        return new AdidasRunningShoe();
    }
}
