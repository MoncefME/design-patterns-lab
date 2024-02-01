package creationalFactoryMethod;

import creationalFactoryMethod.factories.AdidasShoeFactory;
import creationalFactoryMethod.factories.NikeShoeFactory;
import creationalFactoryMethod.factories.ShoeFactory;
import creationalFactoryMethod.shoes.RunningShoe;

public class Main {
    public static void main(String[] args) {
        // Create a Nike running shoe
        ShoeFactory nikeShoeFactory = new NikeShoeFactory();
        RunningShoe nikeRunningShoe = nikeShoeFactory.createRunningShoe();
        nikeRunningShoe.run();

        // Create an Adidas running shoe
        ShoeFactory adidasShoeFactory = new AdidasShoeFactory();
        RunningShoe adidasRunningShoe = adidasShoeFactory.createRunningShoe();
        adidasRunningShoe.run();
    }
}
