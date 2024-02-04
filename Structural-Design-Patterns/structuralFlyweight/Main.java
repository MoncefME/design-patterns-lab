package structuralFlyweight;

public class Main {
    public static void main(String[] args){
        AthleteFactory factory = new AthleteFactory();

        Athlete Moncef= factory.getAthlete("Moncef", "running");
        Athlete Chamel = factory.getAthlete("Chamel", "swimming");
        Athlete Moncef2 = factory.getAthlete("Moncef", "running");

        Moncef.perform("100m", "10.5");
        Chamel.perform("200m", "20.5");
        Moncef2.perform("200m", "20.5");

    }
}
