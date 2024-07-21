import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the day number
        System.out.print("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();

        // Determine the day of the week using switch-case
        String day;
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid day number. Please enter a number between 1 and 7.";
                break;
        }

        // Output the result
        System.out.println(day);

        scanner.close();
    }
}
