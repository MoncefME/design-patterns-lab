package structuralFlyweight;

public class Swimmer implements Athlete{
    private String name;

    public Swimmer(String name){
        this.name = name;
    }

    public void perform(String event, String result){
        System.out.println("Swimmer: " + name + " swam the " + event + " in " + result + " seconds.");
    }
}
