import java.util.Scanner;

public class Insertimage {
    
    public static void main(String[] args){
        int option, size = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("If you want to know how to insert an image in java, enter 1.");
        option = sc.nextInt();

        if(option==1){
            System.out.println("Firstly, download the image on your computer.");
            System.out.println("\nSecondly, Save it in Android Studio.");
            System.out.println("\nFinally, you can access it whenever you want by double clicking it.");
        }
        else{
            System.exit(0);
        }

    }
}
