import java.time.LocalDateTime;

public class Transaction {
    private String transactionType;
    private double amount;
    private LocalDateTime timestamp;

    Transaction(String transactionType , double amount, LocalDateTime timestamp){
        this.amount=amount;
        this.transactionType = transactionType;
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        return "Transaction Type : " + transactionType + "|" + "Amount : " + amount +"|"+ "Timestamp : " + timestamp;
    }
}
