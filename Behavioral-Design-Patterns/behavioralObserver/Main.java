package behavioralObserver;

public class Main {
    public static void main(String[] args){
        Youtuber benIsRunning = new Youtuber("Ben Is Running 🏃‍♂️");
        Subscriber moncef = new Subscriber("Moncef");

        benIsRunning.subscribe(moncef);
        benIsRunning.uploadVideo("How to run a Marathon in 2 hours");

        benIsRunning.unsubscribe(moncef);
        benIsRunning.uploadVideo("How to run a Half Marathon in 1 hour");

    }
}
