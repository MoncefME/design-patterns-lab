package structuralDecorator;

public class ChocolatDecorator extends CoffeeDecorator{
    public ChocolatDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost() {
        return super.cost() + 1.7;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", chocolat";
    }


}
