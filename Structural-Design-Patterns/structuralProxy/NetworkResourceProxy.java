package structuralProxy;

public class NetworkResourceProxy implements NetworkResource{
    private RealNetworkResource realNetworkResource;
    private String accessLevel;

    public NetworkResourceProxy(String accessLevel){
        this.accessLevel = accessLevel;
    }

    public void access(String url){
        if(checkAccess()){
            if(realNetworkResource == null)
                realNetworkResource = new RealNetworkResource();
            realNetworkResource.access(url);
        } else {
            System.out.println("Access denied");
        }
    }

    public boolean checkAccess(){
        return this.accessLevel.equals("admin");
    }
}
