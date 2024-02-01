package creationalBuilder;

public class ActivityBuilder implements Builder {
    private Activity activity;

    public ActivityBuilder(){
       this.reset();
    }

    @Override
    public Builder setDuration(String duration) {
        activity.setDuration(duration);
        return this;
    }

    @Override
    public Builder setIntensity(String intensity) {
        activity.setIntensity(intensity);
        return this;
    }

    @Override
    public Builder setLocation(String location) {
        activity.setLocation(location);
        return this;
    }

    @Override
    public Builder setType(String type) {
        activity.setType(type);
        return this;
    }

    @Override
    public Activity reset() {
        activity = new Activity("Run", "", "", "");
        return activity;
    }

    @Override
    public Activity getActivity(){
        Activity result = activity;
        this.reset();
        return result;
    }
}
