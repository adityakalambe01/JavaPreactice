package w3resources.array.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q13FindDuplicateString {
    public static void main(String[] args) {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        Map<String, Integer> my_map = new HashMap<String, Integer>();
        for (int i = 0; i < my_array.length; i++) {
            my_map.put(my_array[i], my_map.getOrDefault(my_array[i], 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : my_map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
