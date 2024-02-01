package behavioralTemplateMethod;

public class RaceRun extends RunTemplate{
    @Override
    public void warmUp(){
        System.out.println("Running my usual 3km WU before the race 🍉");
    }

    @Override
    public void run(){
        System.out.println("Running as fast as I can , chasing that PB 🔥");
    }

    @Override
    public void coolDown(){
        System.out.println("Enjoying my well deserved achievement 🎖️");
    }
}
