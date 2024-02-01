package creationalBuilder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setActivityBuilder(Builder builder){
        this.builder = builder;
    }

    public Activity getActivity(){
        return builder.getActivity();
    }

    public void constructActivity(String duration, String intensity, String location ){
        builder.setType("Run");
        builder.setDuration(duration);
        builder.setLocation(location);
        builder.setIntensity(intensity);
    }
}
