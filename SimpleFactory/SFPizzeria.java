package SimpleFactory;

public class SFPizzeria {
    public SFPizza createSmallPizza() {
        return new SFPizza(6);
    }

    public SFPizza createMediumPizza() {
        return new SFPizza(8);
    }

    public SFPizza createBigPizza() {
        return new SFPizza(12);
    }
}
