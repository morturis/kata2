package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String []args){
        int[]data = {1, 1, 1, 0, 1, 2, 1, 0, 3};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i : data) {
            histogram.put(i, histogram.containsKey(i) ? 
                    histogram.get(i)+1:1);
        }
        for (int key : histogram.keySet()) {
            System.out.println(key+" --> "+ histogram.get(key)+ " veces");
        }
    }
}

