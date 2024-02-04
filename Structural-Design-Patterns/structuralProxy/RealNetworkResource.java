package structuralProxy;

public class RealNetworkResource implements NetworkResource{
    public void access(String url){
        System.out.println("Accessing " + url);
    }
}
