package State;

public class DriveCar implements ICarState{
    private final Car car;

    public DriveCar(Car car) {
        this.car = car;
    }

    @Override
    public void turnOn() {
        System.out.println("Car is already on!");
    }

    @Override
    public void drive() {
        System.out.println("Car is already moving!");
    }

    @Override
    public void turnOff() {
        System.out.println("Car is off!");
        car.setCurrentState(car.getTurnOffCar());
    }
}
