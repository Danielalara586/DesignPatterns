package Proxy;

public class ProxyUser {
    private int securityLevel; // 1-5 => 5 = Admin

    public ProxyUser(int securityLevel) {
        this.securityLevel = securityLevel;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        this.securityLevel = securityLevel;
    }
}
