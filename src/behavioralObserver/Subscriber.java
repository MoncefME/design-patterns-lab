package behavioralObserver;

public class Subscriber {
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    public void update(String channelName, String videoName){
        System.out.println(this.name + " received a notification : " + channelName + " uploaded a new video : " + videoName);
    }
}
