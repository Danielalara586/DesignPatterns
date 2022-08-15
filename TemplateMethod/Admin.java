package TemplateMethod;

public class Admin extends TempUser{
    @Override
    public void workMethod() {
        System.out.println("Work method of an administrator...");
    }
}
