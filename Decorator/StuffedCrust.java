package Decorator;

public class StuffedCrust implements IDPizza{
    private IDPizza pizza;

    public StuffedCrust(IDPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Stuffed Crust " + this.pizza.description();
    }

    @Override
    public float price() {
        return pizza.price() + 4;
    }
}
