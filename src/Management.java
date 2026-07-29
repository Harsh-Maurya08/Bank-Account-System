import java.util.*;
import java.time.LocalDateTime;
public class Management{
    Transaction transaction;
    ArrayList<Account> accData = new ArrayList<>();

    public Account findAccount(int accNum){
        for(Account a : accData){
            if(a.getAccountNumber()==accNum){
                return a;
            }
        }
        return null;
    }

    public Account addAccount(Account acc){
        accData.add(acc);
        System.out.println("The account is successfully created.\n");
        System.out.println("Your account details are: \n"+acc);
        return acc;
    }

    public void deposit(int accNum , float amount){
        Account a = findAccount(accNum);
        if(a == null){
            System.out.println("\nThe account is not exit in the Bank dataset.\n");
            return;
        }
            if(a.getAccountNumber()==accNum){
                a.setAccountBalance(a.getAccountBalance()+amount);
                LocalDateTime timestamp = LocalDateTime.now();
                a.addTransactionHistory(new Transaction("Deposit", amount, timestamp));
                System.out.printf("\nDeposit of amount : %.2f in the Account number : %d is completed\n",amount,accNum);
                return;
            }
        
    }

    public void withdraw(int accNum , float amount){
        Account a = findAccount(accNum);
        if(a == null){
            System.out.println("\nThe account is not exit in the Bank dataset.\n");
            return;
        }
            if(a.getAccountNumber()==accNum){
                if(a.getAccountBalance()>=amount){
                    a.setAccountBalance(a.getAccountBalance()-amount);
                    LocalDateTime timestamp = LocalDateTime.now();
                    a.addTransactionHistory(new Transaction("Withdraw", amount, timestamp));
                    System.out.printf("\nThe amount : %.2f is withdraw from the Account Number : %d successfully\n",amount,accNum);
                    return;
                }
                else{
                    System.out.println("\nInsuficient Balance...");
                    return;
                }
            }
    }

    public void viewDetails(int accNum){
        Account a = findAccount(accNum);
        if(a.getAccountNumber()==accNum){
                System.out.println("\n"+a);
                return;
            }
        System.out.print("\nThe account number doesn't exist in the bank dataset.\n");
    }

    public void closeAccount(int accNum){
        Account a = findAccount(accNum);
            if(a.getAccountNumber()==accNum){
                accData.remove(a);
                System.out.println("\nThe account is closed successfully.");
                return;
            }
        System.out.println("\nThe account doesn't exit in the Bank dataset.");
    }

    public void getTransaction(int accNum){
        Account a = findAccount(accNum);
        if(a != null){
            a.getTransactionHistory(accNum);
            return;
        }
        System.out.println("Account Not found in the Bank dataset");
    }
}