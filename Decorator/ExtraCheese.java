package Decorator;


public class ExtraCheese implements IDPizza{
    private IDPizza pizza;

    public ExtraCheese(IDPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return "Extra Cheese " + this.pizza.description();
    }

    @Override
    public float price() {
        return pizza.price() + 2;
    }
}
