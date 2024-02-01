package creationalSingleton;

public class Main {
    public static void main(String[] args) {
        Runner runner1 = Runner.getInstance();
        runner1.run();

        Runner runner2 = Runner.getInstance();
        runner2.run();

    }
}
