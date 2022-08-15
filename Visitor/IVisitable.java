package Visitor;

@FunctionalInterface
public interface IVisitable {
    float applyDiscount(IVisitor visitor);
}
