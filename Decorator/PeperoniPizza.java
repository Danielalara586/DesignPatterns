package Decorator;

public class PeperoniPizza implements IDPizza{
    @Override
    public String description() {
        return "Peperoni Pizza";
    }

    @Override
    public float price() {
        return 8;
    }
}
