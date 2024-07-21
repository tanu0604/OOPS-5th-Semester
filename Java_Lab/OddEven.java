import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num%2==0)
        {
          System.out.println("The number is an even number.");
        }
        else
        {
          System.out.println("The number is an odd number.");
        }

    }
}

//Output
//Enter the number: 9
//The number is an odd number.
