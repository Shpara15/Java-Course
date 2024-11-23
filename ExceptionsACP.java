import java.util.Scanner;

public class ExceptionsACP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter 2 numbers.");
            int x = sc.nextInt();
            int y = sc.nextInt();
            float z = x/y;
            System.out.println(x+"/"+y+" = "+z);

        } catch(ArithmeticException ex) {
            System.out.println(ex.toString());

        } finally{
            System.out.println("Code programmed by Shlok.");
            sc.close();
        }

        System.out.println("-----DONE-----");
    }
}
