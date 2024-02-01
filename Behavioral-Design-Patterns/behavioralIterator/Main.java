package behavioralIterator;

public class Main {
    public static void main(String[] args){
        Exercise[] exercises = {
            new Exercise("Run 5 miles", 30),
            new Exercise("Stretch", 15),
            new Exercise("Rest", 10),
            new Exercise("Run sprints", 20),
            new Exercise("Cross-train", 45)
        };

        System.out.println("-------Normal Iterator-------");
        TrainingPlan runnerTrainingPlan = new RunnerTrainingPlan(exercises);

        ExerciseIterator runnerExerciseIterator = runnerTrainingPlan.createIterator();

        while(runnerExerciseIterator.hasNext()){
            Exercise exercise = runnerExerciseIterator.next();
            System.out.println("Do " + exercise.getName() + " for " + exercise.getDuration() + " minutes.");
        }


        System.out.println("-------Reverse Iterator-------");
        ExerciseIterator runnerReverseExerciseIterator = runnerTrainingPlan.createReverseIterator();

        while(runnerReverseExerciseIterator.hasNext()){
            Exercise exercise = runnerReverseExerciseIterator.next();
            System.out.println("Do " + exercise.getName() + " for " + exercise.getDuration() + " minutes.");
        }
    }
}
