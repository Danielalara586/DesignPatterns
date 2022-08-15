package Proxy;

public class Proxy implements IService{
    private IService service; // Expensive method
    private ProxyUser user;

    public Proxy(ProxyUser user) {
        this.service = service;
        this.user = user;
    }

    @Override
    public void read() {
        this.getService().read();
    }

    @Override
    public void write() {
        if(this.user.getSecurityLevel() >= 5) {
            this.getService().write();
        }
        else {
            throw new UnsupportedOperationException("You have not administrator permits");
        }
    }

    @Override
    public void update() {
        if(this.user.getSecurityLevel() >= 5) {
            this.getService().update();
        }
        else {
            throw new UnsupportedOperationException("You have not administrator permits");
        }
    }

    @Override
    public void delete() {
        if(this.user.getSecurityLevel() >= 5) {
            this.getService().delete();
        }
        else {
            throw new UnsupportedOperationException("You have not administrator permits");
        }
    }

    public IService getService() {
        if(this.service == null) {
            this.service = new Service();
        }
        return service;
    }
}
