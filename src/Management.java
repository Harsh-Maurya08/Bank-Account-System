import java.util.*;
public class Management{
    Scanner input = new Scanner(System.in);
    ArrayList<Account> accData = new ArrayList<>();

    public Account addAccount(Account acc){
        accData.add(acc);
        System.out.println("The account is successfully created.\n");
        System.out.println("Your account details are: \n"+acc);
        return acc;
    }

    public void deposit(int accNum , float amount){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                a.setAccountBalance(a.getAccountBalance()+amount);
                System.out.printf("\nDeposit of amount : %.2f in the Account number : %d is completed\n",amount,accNum);
                return;
            }
        }
        System.out.println("\nThe account is not exit in the Bank dataset.\n");
    }

    public void withdraw(int accNum , float amount){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                if(a.getAccountBalance()>=amount){
                    a.setAccountBalance(a.getAccountBalance()-amount);
                    System.out.printf("\nThe amount : %.2f is withdraw from the Account Number : %d successfully\n",amount,accNum);
                    return;
                }
                else{
                    System.out.println("Insuficient Balance...\n");
                    return;
                }
            }
        }
        System.out.println("The Account Number didn't exit in the Bank dataset.\n");
    }

    public void viewDetails(int accNum){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                System.out.println("\n"+a);
                return;
            }
        }
        System.out.print("\nThe account number doesn't exist in the bank dataset.\n");

    }

    public void searchAccount(int accNum){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                System.out.println("\nThe account number is present in the bank dataset.");
                System.out.println("The account details are:"+a);
                return;
            }
        }
        System.out.println("\nThe account number is not present in the bank dataset.");
    }

    public void closeAccount(int accNum){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                accData.remove(a);
                System.out.println("\nThe account is closed successfully.");
                return;
            }
        }
        System.out.println("\nThe account doesn't exit in the Bank dataset.");
    }
}