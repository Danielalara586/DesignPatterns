package Facade;

public class Facade {
    private Computer computer;

    public Facade() {
        IKeyboard keyboard = new Keyboard();
        IMouse mouse = new Mouse();
        this.computer = new Computer(keyboard, mouse);
    }

    public void turnOn() {
        // Complex operations
        this.computer.turnOn();
    }
}
