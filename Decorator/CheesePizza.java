package Decorator;

public class CheesePizza implements IDPizza{
    @Override
    public String description() {
        return "Cheese Pizza";
    }

    @Override
    public float price() {
        return 8;
    }
}
