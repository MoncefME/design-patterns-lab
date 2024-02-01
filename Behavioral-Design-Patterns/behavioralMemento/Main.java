package behavioralMemento;

    public class Main {
    public static void main(String[] args){
        Runner marathonRunner = new Runner("Moncef");
        marathonRunner.run(5);
        marathonRunner.run(10);

        marathonRunner.restoreStats();

        marathonRunner.run(15);
        marathonRunner.run(20);


        marathonRunner.restoreStats();
        marathonRunner.restoreStats();
        marathonRunner.restoreStats();
        marathonRunner.restoreStats();
    }
}
