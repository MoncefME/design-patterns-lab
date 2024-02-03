package structuralDecorator;

public class VanillaDecorator extends CoffeeDecorator{
    public VanillaDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.8;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", vanilla";
    }
}
