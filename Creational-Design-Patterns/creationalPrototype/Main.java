package creationalPrototype;

public class Main {
    public static void main(String[] args){
        Shoe NikeVaporfly = new Shoe("Nike", "Vaporfly", "Carbon");

        Shoe NikeVaporflyFoam = NikeVaporfly.clone();
        NikeVaporflyFoam.setSole("Foam");

        NikeVaporfly.displayInfo();
        NikeVaporflyFoam.displayInfo();

    }
}
