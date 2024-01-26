package behavioralIterator;

public class RunnerReverseExerciseIterator implements ExerciseIterator {
    private Exercise[] exercises;
    private int position;

    public RunnerReverseExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
        position = exercises.length - 1;
    }

    public boolean hasNext(){
        if(position < 0 || exercises[position] == null){
            return false;
        }
        return true;
    }

    public Exercise next(){
        Exercise exercise = exercises[position];
        position--;
        return exercise;
    }

}
