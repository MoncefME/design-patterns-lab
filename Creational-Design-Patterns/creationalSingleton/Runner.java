package creationalSingleton;

public class Runner {
    private static Runner instance;

    private Runner(){
    }

    public static Runner getInstance(){
        if(instance == null){
            instance = new Runner();
            System.out.println("The only Runner instance created");
        }
        return instance;
    }

    public void run(){
        System.out.println("The Main Runner is going for a run");
    }


}
