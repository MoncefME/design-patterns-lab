package behavioralStrategy;

public class TempoRunStrategy implements RunStrategy{
    @Override
    public void performRun(int distance) {
        System.out.println("Running " + distance + " Km at a tempo pace.");
    }
}
