package behavioralTemplateMethod;

public abstract class RunTemplate {
    public final void performRun(){
        warmUp();
        run();
        coolDown();
        postOnStrava();
    }

    protected abstract void warmUp();
    protected abstract void run();
    protected abstract void coolDown();

    private void postOnStrava(){
        System.out.println("Posted run on Strava.");
    }

}
