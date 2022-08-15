package Mediator;

public class MedUser {
    private String name;

    public MedUser(String name) {
        this.name = name;
    }

    public void receiveMessage(String message) {
        System.out.println(message);
    }

    public String getName() {
        return name;
    }
}
