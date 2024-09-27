import java.util.Scanner;
public class Mages {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the name of a maplestory magician class");
    String mage = scanner.nextLine();


        switch(mage){
            case "Evan" -> System.out.println("Better luck next time farm boy");
            case "Kinesis" -> System.out.println("Go back to playing chess");
            case "Illium" -> System.out.println("Go lead your flora army");
            case "Fire-Poison" -> System.out.println("You STINKY");
            case "Lynn" -> System.out.println("You should go back to your FURRY friends haha!");
            case "Lara" -> System.out.println("THAT'S MY GIRL!!");
            default -> System.out.println("We only serve magicians here SIR");
        }

    }
}

//Make user input a name and compare it with the switch statement
