package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String []args){
        Integer[]data = {1, 1, 1, 0, 1, 2, 1, 0, 3};
        Histogram histo = (Histogram) new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        for (Integer integer : histogr.keySet()) {
            System.out.println(integer + " --> "+histogr.get(integer)+" veces");
        }
        
        
    }
}

