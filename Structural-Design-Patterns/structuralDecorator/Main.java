package structuralDecorator;

public class Main {
    public static void main(String[] args){
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.cost() + "; Ingredients: " + simpleCoffee.getDescription());

        Coffee specialCoffee = new ChocolatDecorator(new VanillaDecorator(new MilkDecorator(new SimpleCoffee())));
        System.out.println("Cost: " + specialCoffee.cost() + "; Ingredients: " + specialCoffee.getDescription());

    }
}
