package TemplateMethod;

public class Manager extends TempUser{
    @Override
    public void workMethod() {
        System.out.println("Work method of a manager...");
    }
}
