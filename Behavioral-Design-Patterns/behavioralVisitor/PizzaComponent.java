package behavioralVisitor;

public interface PizzaComponent {
    void accept(PizzaVisitor visitor);
}
