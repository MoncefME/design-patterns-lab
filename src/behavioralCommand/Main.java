package behavioralCommand;

public class Main {
    public static void main(String[] args){
        Runner runner = new Runner();

        TrainingCommand stretch = new StretchCommand(runner);
        TrainingCommand run = new RunCommand(runner);
        TrainingCommand rest = new RestCommand(runner);

        Coach coach = new Coach();

        System.out.println("----Coach asks runner to stretch----");
        coach.setTrainingCommand(stretch);
        coach.executeTrainingCommand();

        System.out.println("----Coach asks runner to run----");
        coach.setTrainingCommand(run);
        coach.executeTrainingCommand();

        System.out.println("----Coach asks runner to rest----");
        coach.setTrainingCommand(rest);
        coach.executeTrainingCommand();

    }
}
