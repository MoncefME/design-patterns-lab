package behavioralState;

public class Runner {
    private String name;
    private FitnessStatus currentFitnessStatus;

    public Runner(String name){
        this.name = name;
        currentFitnessStatus = new ProductiveStatus(this);
    }

    public void setFitnessStatus(FitnessStatus fitnessStatus) {
        this.currentFitnessStatus = fitnessStatus;
    }

    public void displayFitnessStatus() {
        currentFitnessStatus.displayFitnessStatus();
    }

    public void increaseTrainingIntensity(){
        currentFitnessStatus.increaseTrainingIntensity();
    }

    public void decreaseTrainingIntensity(){
        currentFitnessStatus.decreaseTrainingIntensity();
    }


}
