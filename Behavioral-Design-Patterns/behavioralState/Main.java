package behavioralState;

public class Main {
    public static void main(String[] args){
        Runner runner = new Runner("Moncef");
        runner.displayFitnessStatus();


        // Runner is productive
        runner.increaseTrainingIntensity();
        System.out.println("Increasing training intensity...");
        runner.displayFitnessStatus();

        // Runner is peek
        runner.increaseTrainingIntensity();
        System.out.println("Increasing training intensity...");
        runner.displayFitnessStatus();

        // Runner is maintaining
        runner.increaseTrainingIntensity();
        System.out.println("Increasing training intensity...");
        runner.displayFitnessStatus();

        // Runner is unproductive
        runner.decreaseTrainingIntensity();
        System.out.println("Decreasing training intensity...");
        runner.displayFitnessStatus();

        // Runner is peek
        runner.increaseTrainingIntensity();
        System.out.println("Increasing training intensity...");
        runner.displayFitnessStatus();

    }
}
