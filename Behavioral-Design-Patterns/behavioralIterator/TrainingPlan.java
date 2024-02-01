package behavioralIterator;

public interface TrainingPlan {
    ExerciseIterator createIterator();
    ExerciseIterator createReverseIterator();
}
