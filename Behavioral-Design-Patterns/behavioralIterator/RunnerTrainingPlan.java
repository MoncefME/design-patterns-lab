package behavioralIterator;

public class RunnerTrainingPlan implements TrainingPlan{
    private Exercise[] exercises;

    public RunnerTrainingPlan(Exercise[] exercises){
        this.exercises = exercises;
    }
    @Override
    public ExerciseIterator createIterator(){
        return new RunnerExerciseIterator(exercises);
    }
    @Override
    public ExerciseIterator createReverseIterator(){
        return new RunnerReverseExerciseIterator(exercises);
    }
}
