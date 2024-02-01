package behavioralVisitor;

public class Topping implements PizzaComponent{
    @Override
    public void accept(PizzaVisitor visitor) {
        visitor.visit(this);
    }

    public void addTopping() {
        System.out.println("Topping added");
    }
}
