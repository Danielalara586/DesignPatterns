package ChainOfResponsibility;

public interface IManager {
    void nextManager(IManager next);
    void executeTransaction(Transaction transaction);
}
