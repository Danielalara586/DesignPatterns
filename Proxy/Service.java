package Proxy;

public class Service implements IService{
    @Override
    public void read() {
        System.out.println("Read!");
    }

    @Override
    public void write() {
        System.out.println("Write!");
    }

    @Override
    public void update() {
        System.out.println("Update!");
    }

    @Override
    public void delete() {
        System.out.println("Delete!");
    }
}
