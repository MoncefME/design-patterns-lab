package behavioralTemplateMethod;

public class MoringRun extends RunTemplate{
    @Override
    public void warmUp(){
        System.out.println("Warming up before morning run.");
    }

    @Override
    public void run(){
        System.out.println("Running in the morning☀️.");
    }

    @Override
    public void coolDown(){
        System.out.println("Cooling down after morning run.");
    }
}
