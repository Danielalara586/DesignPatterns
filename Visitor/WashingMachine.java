package Visitor;

public class WashingMachine implements IWhiteLine{
    @Override
    public float getPrice() {
        return 2f;
    }

    public float applyDiscount(IVisitor visitor) {
        return visitor.visit(this);
    }
}
