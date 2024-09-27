
import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        double x;
        double y;
        double r;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first side");
        x = scanner.nextDouble();
        System.out.println("Enter the second side");
        y = scanner.nextDouble();
        r = Math.sqrt ((x*x) + (y*y));
        System.out.println("The hypotenuse of this triangle is " + r);

    }
}

// Use Math class to calculate r