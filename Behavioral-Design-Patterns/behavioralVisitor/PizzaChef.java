package behavioralVisitor;

public class PizzaChef implements PizzaVisitor {
    @Override
    public void visit(Cheese cheese) {
        System.out.println("Pizza chef is adding cheese");
        cheese.addCheese();
    }

    @Override
    public void visit(Topping topping) {
        System.out.println("Pizza chef is adding topping");
        topping.addTopping();
    }
}
