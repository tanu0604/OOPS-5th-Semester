import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] array = new int[n];

        // Read the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Print the sum
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
