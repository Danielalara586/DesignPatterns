package AbstractFactory;

public class AppleStore implements IAbstractFactory{
    @Override
    public IComputer createComputer() {
        return new Macbook();
    }

    @Override
    public ITablet createTablet() {
        return new Ipad();
    }
}
