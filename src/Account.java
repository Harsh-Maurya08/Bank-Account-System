public class Account {
    private int accountNumber;
    private String accountHolder;
    private float accountBalance;

    Account(int accountNumber, String accountHolder, float accountBalance){
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

    public float getAccountBalance(){
        return accountBalance;
    } 

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account Number :" + accountNumber + "|" + "Name of Holder :" + accountHolder + "|" 
                + "Current Balance : " + accountBalance; 
    }
}
