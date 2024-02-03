package structuralDecorator;

public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 1;
    }

    @Override
    public String getDescription() {
        return "Simple coffee";
    }
}
