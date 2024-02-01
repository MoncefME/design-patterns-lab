package behavioralStrategy;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner("Moncef");

        runner.setRunStrategy(new EasyRunStrategy());
        runner.run(10);

        runner.setRunStrategy(new IntervalRunStrategy());
        runner.run(8);

        runner.setRunStrategy(new TempoRunStrategy());
        runner.run(5);

    }
}
