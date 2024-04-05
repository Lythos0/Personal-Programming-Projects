import java.util.*;

public class MathTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of this rectangle? ");
        Double length = scan.nextDouble();
        scan.nextLine();
        System.out.println(" What is the width of this rectangle? ");
        double width = scan.nextDouble();
        scan.nextLine();
        double area = length * width;
        

        System.out.println("The area of this rectangle is " + area + " square feet");

    }
}
