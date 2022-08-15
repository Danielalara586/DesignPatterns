package State;

public class TurnOnCar implements ICarState{
    private final Car car;

    public TurnOnCar(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("Car is already on!");
    }

    @Override
    public void drive() {
        System.out.println("Car is moving!");
        car.setCurrentState(car.getDriveCar());
    }

    @Override
    public void turnOff() {
        System.out.println("Car is off!");
        car.setCurrentState(car.getTurnOffCar());
    }
}
