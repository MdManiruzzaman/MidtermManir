package datastructure;

import java.util.HashMap;
import java.util.Map;

public class CollectionView {

public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "PA");
        map.put(3, "CA");
        map.put(4, "Boston");
        map.put(5, "NJ");
        map.put(6, "Florida");

        for (Map.Entry<Integer, String> USA : map.entrySet()) {
                System.out.println("Collection View of USA is " + USA.getKey() + ": " + USA.getValue());
        }
    }
}
