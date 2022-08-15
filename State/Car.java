package State;

public class Car implements ICarState{
    private ICarState turnOnCar;
    private ICarState turnOffCar;
    private ICarState driveCar;
    private ICarState currentState;

    public Car() {
        this.turnOffCar = new TurnOffCar(this);
        this.turnOnCar = new TurnOnCar(this);
        this.driveCar = new DriveCar(this);
        this.currentState = this.turnOnCar;
    }

    @Override
    public void turnOn() {
        this.currentState.turnOn();
    }

    @Override
    public void drive() {
        this.currentState.drive();
    }

    @Override
    public void turnOff() {
        this.currentState.turnOff();
    }

    public ICarState getTurnOnCar() {
        return turnOnCar;
    }

    public void setTurnOnCar(ICarState turnOnCar) {
        this.turnOnCar = turnOnCar;
    }

    public ICarState getTurnOffCar() {
        return turnOffCar;
    }

    public void setTurnOffCar(ICarState turnOffCar) {
        this.turnOffCar = turnOffCar;
    }

    public ICarState getDriveCar() {
        return driveCar;
    }

    public void setDriveCar(ICarState driveCar) {
        this.driveCar = driveCar;
    }

    public ICarState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ICarState currentState) {
        this.currentState = currentState;
    }
}
