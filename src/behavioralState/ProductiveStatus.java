package behavioralState;

public class ProductiveStatus implements FitnessStatus{
    private final Runner runner;

    public ProductiveStatus(Runner runner){
        this.runner = runner;
    }
    @Override
    public void displayFitnessStatus() {
        System.out.println("I am productive today!");
    }

    @Override
    public void increaseTrainingIntensity(){
        runner.setFitnessStatus(new PeekStatus(runner));
    }

    @Override
    public void decreaseTrainingIntensity(){
        runner.setFitnessStatus(new MaintainingStatus(runner));
    }


}
