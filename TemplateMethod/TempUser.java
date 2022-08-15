package TemplateMethod;

public abstract class TempUser {

    public void auth() {
        System.out.println("All users need to be authenticated");
    }

    abstract void workMethod();

}
