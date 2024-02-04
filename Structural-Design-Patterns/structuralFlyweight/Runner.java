package structuralFlyweight;

public class Runner implements Athlete{
    private String name;

    public Runner(String name){
        this.name = name;
    }

    public void perform(String event, String result){
        System.out.println("Runner: " + name + " ran the " + event + " in " + result + " seconds.");
    }
}
