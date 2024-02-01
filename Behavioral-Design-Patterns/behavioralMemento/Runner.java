package behavioralMemento;

import java.util.Stack;

public class Runner {
    private String name;
    private int distanceCovered;
    private String location;

    private final Stack<RunningStatsMemento> mementoStack = new Stack<>();

    public Runner(String name){
        this.name = name;
        this.distanceCovered = 0;
        this.location = "Starting Line";
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public void run(int distance){
        this.distanceCovered += distance;
        this.location = "Km " + this.distanceCovered;
        System.out.println("Running "+ distance +"km, "+this.name + " is at " + this.location);
        saveStats();
    }

    public void saveStats(){
        RunningStatsMemento memento = new RunningStatsMemento(this.distanceCovered, this.location);
        mementoStack.push(memento);
    }

    public void restoreStats(){
        if(this.mementoStack.isEmpty()){
            System.out.println("No more stats to restore");
        }else{
            RunningStatsMemento memento = mementoStack.pop();
            this.distanceCovered = memento.getDistanceCovered();
            this.location = memento.getLocation();
            System.out.print(this.name+ " went back to " + location+ "\n");
        }
    }
}
