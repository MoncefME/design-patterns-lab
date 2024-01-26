package behavioralIterator;

public class RunnerExerciseIterator implements ExerciseIterator{
    private final Exercise[] exercises;
    private int position;

    RunnerExerciseIterator(Exercise[] exercises){
        this.exercises = exercises;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < exercises.length;
    }

    @Override
    public Exercise next() {
        if(hasNext()){
            return exercises[position++];
        }else{
            return null;
        }
    }
}
