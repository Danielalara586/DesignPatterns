package ChainOfResponsibility;

public class Withdrawal implements IManager{
    private IManager next;

    @Override
    public void nextManager(IManager next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if(transaction.getType()==TransactionType.Withdrawal) {
            float quantity = transaction.getQuantity() - transaction.getBalance();
            System.out.printf("New balance after withdrawal: $%.2f", quantity);
        }
        else {
            this.next.executeTransaction(transaction);
        }
    }
}
