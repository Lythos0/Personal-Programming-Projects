import java.util.Scanner;
import java.util.Calendar;

public class PracticeInput {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Please enter the name of the game you play the most: ");
        String name = scanner.nextLine();

        // Ask for the user's age
        System.out.print("Enter the amount of years you've been playing for: ");
        int years = scanner.nextInt();

        // Get the current year
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        
        int yearTurning20 = currentYear + (20 - years);

        // Print the greeting message
        System.out.println("You started your journey in " + name + "! You would've played " + name + " for 20 years in " + yearTurning20 + ".");
    }
}
