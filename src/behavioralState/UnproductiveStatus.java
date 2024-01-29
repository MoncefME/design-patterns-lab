package behavioralState;

public class UnproductiveStatus implements FitnessStatus{
    private Runner runner;

    public UnproductiveStatus(Runner runner){
        this.runner = runner;
    }
    @Override
    public void displayFitnessStatus() {
        System.out.println("I am unproductive today!");
    }

    @Override
    public void increaseTrainingIntensity(){
        runner.setFitnessStatus(new MaintainingStatus(runner));
    }

    @Override
    public void decreaseTrainingIntensity(){
    }
}
