package behavioralState;

public class MaintainingStatus implements FitnessStatus{
    private final Runner runner;

    public MaintainingStatus(Runner runner){
        this.runner = runner;
    }
    @Override
    public void displayFitnessStatus() {
        System.out.println("I am maintaining today!");
    }

    @Override
    public void increaseTrainingIntensity(){
        runner.setFitnessStatus(new ProductiveStatus(runner));
    }

    @Override
    public void decreaseTrainingIntensity(){
        runner.setFitnessStatus(new UnproductiveStatus(runner));
    }


}
