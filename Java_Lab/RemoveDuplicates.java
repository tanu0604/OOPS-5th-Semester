import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 30, 30};
        Set<Integer> set = new LinkedHashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        Integer[] uniqueArray = set.toArray(new Integer[0]);
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
