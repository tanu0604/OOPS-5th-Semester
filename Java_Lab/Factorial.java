import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int ans = Fact(num);
        System.out.println("The factorial of the given number is: " + ans);
    }

    public static int Fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * Fact(num - 1);
    }
}
//Output

//Enter the number: 4
//The factorial of the given number is:  24
