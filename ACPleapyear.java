
import java.util.Scanner;

public class ACPleapyear {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a year.");

        Integer leapyear = Integer.parseInt(x.nextLine());
        System.out.println("User input: " + leapyear);

        if (leapyear % 4 == 0) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }

    }
}
