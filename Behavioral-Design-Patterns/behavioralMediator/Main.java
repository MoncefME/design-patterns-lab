package behavioralMediator;

public class Main {
    public static void main(String[] args){
        RaceCoordinator marathonCoordinator = new MarathonCoordinator();

        RaceParticipant runner1 = new Runner("Moncef", marathonCoordinator);
        RaceParticipant runner2 = new Runner("Fadi", marathonCoordinator);
        RaceParticipant runner3 = new Runner("Ahmed", marathonCoordinator);

        marathonCoordinator.addParticipant(runner1);
        marathonCoordinator.addParticipant(runner2);
        marathonCoordinator.addParticipant(runner3);

        runner1.updateStatus("Salam from " + runner1.getName() );
        System.out.println("=====================================");

        runner2.updateStatus("Hi from " + runner2.getName() );
        System.out.println("=====================================");

        runner3.updateStatus("Hello from " + runner3.getName());

    }
}
