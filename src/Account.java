public class Account {
    private int accountNumber;
    private String accountHolder;
    private Double accountBalance;

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

    @Override
    public String toString() {
        return "Account Number :" + accountNumber + "|" + "Name of Holder :" + accountHolder + "|" 
                + "Current Balance : " + accountBalance; 
    }
}
