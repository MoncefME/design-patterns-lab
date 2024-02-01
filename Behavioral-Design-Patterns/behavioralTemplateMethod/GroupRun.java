package behavioralTemplateMethod;

public class GroupRun extends RunTemplate{
    @Override
    public void warmUp(){
        System.out.println("No need to warm up, They probably run super slow 🐢");
    }

    @Override
    public void run(){
        System.out.println("Running with the group , chatting and having fun 🎉");
    }

    @Override
    public void coolDown(){
        System.out.println("After group run, Having lunch together 😋");
    }
}
