package creationalBuilder;

public interface Builder {
    Builder setType(String type);
    Builder setDuration(String duration);
    Builder setLocation(String location);
    Builder setIntensity(String intensity);
    Activity reset();
    Activity getActivity();
}
