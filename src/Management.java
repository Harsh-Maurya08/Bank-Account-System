import java.util.*;
public class Management{
    Scanner input = new Scanner(System.in);
    ArrayList<Account> accData = new ArrayList<>();

    public Account addAccount(Account acc){
        accData.add(acc);
        System.out.println("The account is successfully created.\n");
        return acc;
    }

    public void deposit(int accNum , float amount){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                a.setAccountBalance(a.getAccountBalance()+amount);
                System.out.printf("Deposit of amount in the Account number : %d is completed",accNum);
                return;
            }
        }
        System.out.println("The account is not exit in the Bank dataset.\n");
    }

    public void withdraw(int accNum , float amount){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                if(a.getAccountBalance()<=amount){
                    a.setAccountBalance(a.getAccountBalance()-amount);
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

    public Account viewDetails(int accNum){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                return a;
            }
            else{
                System.out.print("The account number doesn't exist in the bank dataset.\n");
            }
        }
        return null;
    }
}