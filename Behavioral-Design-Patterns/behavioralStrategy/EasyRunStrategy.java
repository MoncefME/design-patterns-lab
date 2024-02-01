package behavioralStrategy;

public class EasyRunStrategy implements RunStrategy{
    @Override
    public void performRun(int distance) {
        System.out.println("Running " + distance + " Km at an easy pace.");
    }
}
