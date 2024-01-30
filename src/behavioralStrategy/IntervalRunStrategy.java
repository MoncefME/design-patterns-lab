package behavioralStrategy;

public class IntervalRunStrategy implements RunStrategy{
    @Override
    public void performRun(int distance) {
        System.out.println("Running " + distance + " Km at an interval pace.");
    }
}
