package kolekcijos;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer, String> mapas= new HashMap<>();
        mapas.put(12, "Jonas");
        mapas.put(4, "Jona");
        mapas.put(4, "Petras");
        mapas.put(100, "Ona");
        mapas.put(69, "Jonas");

        for (Integer m: mapas.keySet()){
            System.out.println("key" + m + " value " + mapas.get(m));
        }





    }
}
