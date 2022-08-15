package Observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Product implements IObservable{
    private int stock;
    private Set<IObserver> observers;

    public Product(int stock) {
        this.stock = stock;
        this.observers = new LinkedHashSet<>();
    }

    public void sales(){
        this.setStock(this.stock - 1);
        System.out.println("Sold product!");
        this.notifyObservers();
    }


    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : this.observers) {
            observer.notify("The product has been sold!");
        }
    }

    @Override
    public void removeObserver() {

    }
}
