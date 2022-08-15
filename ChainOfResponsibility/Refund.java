package ChainOfResponsibility;

public class Refund implements IManager{
    private IManager next;

    @Override
    public void nextManager(IManager next) {
        this.next = next;
    }

    @Override
    public void executeTransaction(Transaction transaction) {
        if(transaction.getType()==TransactionType.Refund) {
            float quantity = transaction.getQuantity() + transaction.getBalance();
            System.out.printf("New balance after refund: $%.2f", quantity);
        }
        else {
            System.out.println("Invalid operation");
        }
    }
}
