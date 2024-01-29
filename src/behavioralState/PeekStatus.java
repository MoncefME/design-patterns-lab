package behavioralState;

public class PeekStatus implements FitnessStatus{
    private final Runner runner;

    public PeekStatus(Runner runner){
        this.runner = runner;
    }
    @Override
    public void displayFitnessStatus() {
        System.out.println("I am peeking today!");
    }

    @Override
    public void increaseTrainingIntensity(){}

    @Override
    public void decreaseTrainingIntensity(){
        runner.setFitnessStatus(new ProductiveStatus(runner));
    }
}
