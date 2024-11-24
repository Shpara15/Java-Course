import java.util.Scanner;

public class SummaryCode {
    public static void main(String[] args){
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000];
        String[] accountName = new String[1000];
        int option, size = 100;

        while(infiniteLoop){
            System.out.println("Welcome to Codingal Banking Services");
            System.out.println("Banking menu: ");
            System.out.println("Select from any option below.");
            System.out.println(" 1 -> Add Customer");
            System.out.println(" 2 -> Change Customer Name");
            System.out.println(" 3 -> Check Account Balance");
            System.out.println(" 4 -> Update Account Balance");
            System.out.println(" 5 -> Summary of Account");
            System.out.println(" 6 -> Quit");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your option to proceed ahead");

            option = sc.nextInt();

            if (option == 1){
                System.out.println("\nAdd Customer \nMenu->");

                sc.nextLine();

                System.out.println("\n Enter Customer Name:");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.println("Enter opening balance amount:");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("Account created successfully. \n");
                System.out.println("Account details:- \n");
                System.out.println("Account Number:" + (size));
                System.out.println("Account Name:" + accountName[size]);
                System.out.println("Account Balance:" + accountBalance[size]+"Rs \n" );
                System.out.println("====================");

            }
            else if(option==2){
                System.out.println("\nChange Customer Name Menu ");
                System.out.println("\nEnter your Account Number: ");

                int accountIndex;
                String temp;

                

            }

        
        }


    }
    
}
