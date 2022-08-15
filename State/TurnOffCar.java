package State;

public class TurnOffCar implements ICarState{
    private final Car car;

    public TurnOffCar(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("Car is on!");
        car.setCurrentState(car.getTurnOnCar());
    }

    @Override
    public void drive() {
        System.out.println("Car is off, it cannot move!");
    }

    @Override
    public void turnOff() {
        System.out.println("Car is off!");
    }
}
