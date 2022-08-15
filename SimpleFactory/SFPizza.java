package SimpleFactory;

public class SFPizza {
    private int numSlices;

    public SFPizza(int numSlices) {
        this.numSlices = numSlices;
    }

    @Override
    public String toString() {
        return "Pizza slices: " + numSlices;
    }
}
