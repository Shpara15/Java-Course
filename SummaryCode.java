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

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex > size){
                    System.out.println("Account does not exist.");
                    System.out.println("Termininating...");
                }
                else{
                    temp = accountName[accountIndex];
                    System.out.println("Enter the new name: ");
                    String name = sc.nextLine();
                    accountName[accountIndex] = name;
                    System.out.println("Name is updated from "+temp+" to "+name+".\n");
                }
                System.out.println("====================");

            }
            else if(option==3){
                System.out.println("Check Account Balance Menu");
                System.out.println("Enter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size){
                    System.out.println("Account does not exist.");
                    System.out.println("Termininating...");

                }
                else{
                    System.out.println(accountName[accountIndex]+" your balance is "+accountBalance[accountIndex]+"Rs.");
                    
                }
                System.out.println("===================");
            }
            else if(option==4){
                System.out.println("Update Balance Account Menu");
                System.out.println("Enter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if(accountIndex > size){
                    System.out.println("Account does not exist.");
                    System.out.println("Termininating...");
                }
                else{
                    System.out.println("Enter the amount to be deposited: ");
                    double amt = sc.nextDouble();
                    accountBalance[accountIndex] += amt;
                    System.out.println(accountName[accountIndex]+" your updated balance is: "+ accountBalance[accountIndex]+"Rs. \n");

                }
                System.out.println("====================");
            }
            else if(option==5){
                System.out.println("Accounts registered\n");
                for(int i=100;i<size;i++){
                    System.out.println("Account Number: "+i+", Name: "+accountName[i]+", Balance: "+accountBalance[i]+"Rs\n");
                }
                System.out.println("====================");
            }
            else if(option==6){
                System.out.println("Terminating...");
                infiniteLoop = false;
            }
            else{
                System.out.println("Invalid Input.");
                System.out.println("Terminating...");

                System.exit(0);
            }

        
        }


    }
    
}
