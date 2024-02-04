package structuralFlyweight;

import java.util.HashMap;
import java.util.Map;

public class AthleteFactory {
    private Map<String,Athlete> athletes = new HashMap<>();

    public Athlete getAthlete(String name, String sport){
        String key = name +"-"+ sport;
        if(!athletes.containsKey(key)){
            if(sport.equals("running")){
                athletes.put(key, new Runner(name));
            }else if(sport.equals("swimming")){
                athletes.put(key, new Swimmer(name));
            }
        }
        return athletes.get(key);
    }
}
