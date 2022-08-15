package FactoryMethod;

public class FMPizza {
    private int numSlices;
    private String pizzaType;

    public FMPizza(int numSlices, String pizzaType) {
        this.numSlices = numSlices;
        this.pizzaType = pizzaType;
    }

    @Override
    public String toString() {
        return "Pizza slices: " + numSlices + "\t\tType: " + pizzaType;
    }
}
