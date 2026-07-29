import java.util.*;
public class Account {
    private int accountNumber;
    private String accountHolder;
    private Double accountBalance;

    ArrayList<Transaction> transactionHistory = new ArrayList<>();

    public Account(int accountNumber, String accountHolder, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public double getAccountBalance(){
        return accountBalance;
    } 

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void addTransactionHistory(Transaction t){
        transactionHistory.add(t);
    }

    public void getTransactionHistory(int accNum){
        if(transactionHistory.isEmpty()){
            System.out.println("No entry is found for this Account");
            return;
        }
        System.out.println("\n----Transaction History----\n");
        for(Transaction t : transactionHistory){
            System.out.println(t);
        }
    }

    @Override
    public String toString() {
        return "Account Number :" + accountNumber + "|" + "Name of Holder :" + accountHolder + "|" 
                + "Current Balance : " + accountBalance; 
    }
}
