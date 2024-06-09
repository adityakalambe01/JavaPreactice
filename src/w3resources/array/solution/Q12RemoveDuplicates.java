package w3resources.array.solution;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q12RemoveDuplicates {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 6, 7, 2};

        Map<Integer,Integer> my_map = new TreeMap<>();
        for (int i = 0; i < my_array.length; i++) {
            my_map.put(my_array[i],my_map.getOrDefault(my_array[i],0)+1);
        }

        for (Integer key : my_map.keySet()) {
            if (my_map.get(key) > 1) {
                System.out.println("Duplicate elements: " + key);
            }
        }
    }
}
