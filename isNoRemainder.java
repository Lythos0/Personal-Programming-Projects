public class isNoRemainder {
    public static void main(String[] args) {
    double testValue = 54.00;
        double secondTestValue = 80.00;
        double finalTestValue = (testValue + secondTestValue) * 100.00;
        System.out.println("The final value: " + " " + finalTestValue);
        double secondFinalTestValue = finalTestValue % 40.00;
        double theRemainder = secondFinalTestValue;
        System.out.println("The remainder is: " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = "  + isNoRemainder);
}
    }