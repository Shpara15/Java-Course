import java.util.*;

public class ACPreversnumber {
public static void main(String[] args) {
    System.out.println("Choose a 2 digit number and i will reverse it"); 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the tens digit of the number.");
    int digit1 = sc.nextInt();
    System.out.println("Enter the units digit of the number. ");
    int digit2 = sc.nextInt();
    System.out.println("The reverse of your number is "+digit2+""+digit1);

}
    
}
