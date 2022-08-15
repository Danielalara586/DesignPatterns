package Flyweight;

public class Cloud {
    private CloudType type;
    private String image;
    private int x, y;

    public Cloud(CloudType type, String image, int x, int y) {
        this.type = type;
        this.image = image;
        this.x = x;
        this.y = y;
    }

    public CloudType getType() {
        return type;
    }

    public void setType(CloudType type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
