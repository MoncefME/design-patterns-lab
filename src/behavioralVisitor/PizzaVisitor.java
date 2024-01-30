package behavioralVisitor;

public interface PizzaVisitor {
    void visit(Cheese cheese);
    void visit(Topping topping);

}
