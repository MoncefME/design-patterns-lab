package creationalBuilder;

public class Main {
    public static void main(String[] args) {
        //this is a bad example of builder pattern I'll fix it later and think of a better example
        Builder builder = new ActivityBuilder();
        Director director = new Director(builder);
        director.constructActivity("30 min", "low", "park");
        Activity activity = director.getActivity();
        activity.displayInfo();
    }
}
