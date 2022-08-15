package Memento;

public class MemUser {
    private String name;
    private int age;

    public MemUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public MemUser getMemento() {
        return new MemUser(this.getName(), this.getAge());
    }

    public void restartMemento(MemUser user) {
        this.setName(user.getName());
        this.setAge(user.getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
