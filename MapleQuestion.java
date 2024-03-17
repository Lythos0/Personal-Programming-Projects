import java.util.*;

public class MapleQuestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What class is your favorite in MapleStory? ");
        String favorite = scan.nextLine();
        System.out.println("What level is your main? ");
        int level = scan.nextInt();
        System.out.println(" My favorite class is " + favorite);
        System.out.println("My main is currently level " + level);
    }
}
