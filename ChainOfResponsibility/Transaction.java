package ChainOfResponsibility;

public class Transaction {
    private float quantity, balance;
    private TransactionType type;

    public Transaction(float quantity, float balance, TransactionType type) {
        this.quantity = quantity;
        this.balance = balance;
        this.type = type;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
}
