package behavioralObserver;

import java.util.ArrayList;
import java.util.List;

public class Youtuber {
    private String channelName;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public Youtuber(String channelName){
        this.channelName = channelName;
    }

    public void subscribe(Subscriber subscriber){
        this.subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        this.subscriberList.remove(subscriber);
    }

    public void uploadVideo(String videoName){
        System.out.println(this.channelName +" uploaded a new Video : " + videoName);
        notifySubscribers(videoName);
    }
    public void notifySubscribers(String videoName){
        for(Subscriber subscriber: subscriberList){
            subscriber.update(this.channelName, videoName);
        }
    }
}
