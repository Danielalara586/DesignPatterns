package Visitor;

public class CommonDiscount implements IVisitor{
    @Override
    public float visit(IFruit fruit) {
        return fruit.getPrice() * 0.10f;
    }

    @Override
    public float visit(IWhiteLine whiteLine) {
        return whiteLine.getPrice() * 0.05f;
    }
}
