// Count the frequency of each element in an array
import java.util.HashMap;
import java.util.Map;

public class ArrayQ7 {
    public static void frequencyCountHashMap(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count frequencies
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        // Print the frequencies
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println("Frequency of :" + e.getKey() + " is " + e.getValue());
        }
    }

    public static void main(String[] args) {
        int[] array = { 12, 43, 13, 45, 68, 90, 67, 36, 12, 36, 43, 43, 43 };

        frequencyCountHashMap(array);
    }
}
