package creationalBuilder;

public class Activity {
    private String type;
    private String duration;
    private String location;
    private String intensity;

    public Activity(String type, String duration, String location, String intensity){
        this.type = type;
        this.duration = duration;
        this.location = location;
        this.intensity = intensity;
    }

    public void displayInfo(){
        System.out.println("Activity type: " + type + ", duration: " + duration + ", location: " + location + ", intensity: " + intensity);
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }
}
