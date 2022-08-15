package Observer;

public interface IObservable {
    void addObserver(IObserver observer);
    void notifyObservers();
    void removeObserver();
}
