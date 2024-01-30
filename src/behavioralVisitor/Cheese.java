package behavioralVisitor;

public class Cheese implements PizzaComponent{
    @Override
    public void accept(PizzaVisitor visitor) {
        visitor.visit(this);
    }

    public void addCheese() {
        System.out.println("Cheese added");
    }
}
