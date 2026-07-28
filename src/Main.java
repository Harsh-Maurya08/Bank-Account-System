import java.util.*;
public class Main {
    static int accountSerial = 0;
    static Management management = new Management();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        boolean n=true;
        while(n){
            System.out.println(" \n 1.Create Account \n 2.Deposit Money \n 3.Withdraw Money \n 4.View Account Details \n 5.View Transaction History \n 6.Search Account \n 7.Close Account \n 8.Exit\n");
            System.out.print("Enter your Choice: ");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    createFunc();
                    break;
                case 2:
                    depositFunc();
                    break;
                case 3:
                    withdrawFunc();
                    break;
                case 4:
                    viewDetailsFunc();
                    break;
                case 5:
                    viewHistoryFunc();
                    break;
                case 6:
                    searchFunc();
                    break;
                case 7:
                    closeFunc();
                    break;
                case 8:
                    System.out.println("The Bank Management Ends...");
                    n=false;
                    break;
            }
        }
    }

    public static void createFunc(){
        System.out.print("Enter the account holder name: ");
        String name = input.next();
        accountSerial++;
        float balance = 0;
        management.addAccount(new Account(accountSerial,name,balance));
    }

    public static void depositFunc(){
        System.out.print("Please Enter the account number: ");
        int accountNum = input.nextInt();
        System.out.print("Enter the amount to deposit: ");
        float amount = input.nextFloat();
        management.deposit(accountNum,amount);
    }

    public static void withdrawFunc(){
        System.out.print("Enter the account number: ");
        int accNum = input.nextInt();
        System.out.print("Enter the amount to withdraw: ");
        float amount = input.nextFloat();
        management.withdraw(accNum, amount);
    }

    public static void viewDetailsFunc(){
        System.out.print("Enter the Account Number: ");
        int accNum = input.nextInt();
        management.viewDetails(accNum);
    }

    public static void viewHistoryFunc(){

    }

    public static void searchFunc(){
        System.out.print("Enter the Account Number:");
        int accNum = input.nextInt();
        management.searchAccount(accNum);
    }

    public static void closeFunc(){
        System.out.print("Enter the Account Number:");
        int accNum = input.nextInt();
        management.closeAccount(accNum);
        accountSerial--;
    }
}
