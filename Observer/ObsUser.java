package Observer;

public class ObsUser implements IObserver{
    @Override
    public void notify(String message) {
        System.out.println(message);
    }
}
