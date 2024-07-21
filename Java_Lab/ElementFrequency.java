import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 30, 30};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i : arr) {
            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}

//Output

// Element: 20, Frequency: 2
// Element: 10, Frequency: 2
// Element: 30, Frequency: 3
