package FactoryMethod;

public class FMPizzeria  implements IFMPizza{

    @Override
    public FMPizza createPizza(String type) {
        if(type.equals("Peperoni"))
            return new FMPizza(8, "Peperoni");
        if(type.equals("Cheese"))
            return new FMPizza(8, "Cheese");
        if(type.equals("Peperoni Stuffed Crust"))
            return new StuffedCrustPizza(12, "Peperoni");

        return null;
    }
}
