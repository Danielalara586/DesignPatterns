package Prototype;

public class Enemy {
    private String img;
    private int x, y, life;

    public Enemy(String img, int x, int y, int life) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.life = life;
    }

    public Enemy(Enemy enemy) {
        this.setImg(enemy.getImg());
        this.setX(enemy.getX());
        this.setY(enemy.getY());
        this.setLife(enemy.getLife());
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    // Instance method
    public Enemy clone() {
        return new Enemy(this);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "img='" + img + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", life=" + life +
                '}';
    }
}
