package structuralProxy;

public class Main {
    public static void main(String[] args){
        NetworkResource adminProxy = new NetworkResourceProxy("admin");
        NetworkResource userProxy = new NetworkResourceProxy("user");

        adminProxy.access("www.google.com");
        userProxy.access("www.google.com");
    }
}
