package structuralDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }
}
