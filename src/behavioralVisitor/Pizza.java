package behavioralVisitor;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<PizzaComponent> components = new ArrayList<>();

    public void addComponent(PizzaComponent component){
        components.add(component);
    }

    public void prepare(PizzaVisitor visitor){
        for (PizzaComponent component : components) {
            component.accept(visitor);
        }
    }
}
