package ChainOfResponsibility;

public class Deposit implements IManager{
    private IManager next;

    @Override
    public void nextManager(IManager next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if(transaction.getType()==TransactionType.Deposit) {
            float quantity = transaction.getQuantity() + transaction.getBalance();
            System.out.printf("New balance after deposit: $%.2f", quantity);
        }
        else {
            this.next.executeTransaction(transaction);
        }
    }
}
