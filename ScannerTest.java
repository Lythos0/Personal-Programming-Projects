import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Did this test go through?");
        String response = scanner.nextLine();
        System.out.println("How many years have you been playing Lara for?");
        int years = scanner.nextInt();

        System.out.println("Good to see! Your response was: " + response);
        System.out.println("Oooooh you played Lara for " + years + " years eh?");
        
    }
}
