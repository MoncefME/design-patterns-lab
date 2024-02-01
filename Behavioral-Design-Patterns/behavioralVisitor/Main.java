package behavioralVisitor;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza();
        pizza.addComponent(new Cheese());
        pizza.addComponent(new Topping());

        PizzaVisitor visitor = new PizzaChef();
        pizza.prepare(visitor);
    }
}
