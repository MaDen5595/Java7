package Z1;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() {
        this.x = x + xSpeed;
    }

    public void moveDown() {
        this.x = x - xSpeed;
    }

    public void moveLeft() {
        this.y = y + ySpeed;
    }

    public void moveRight() {
        this.y = y - ySpeed;
    }

    public String toString() {
        return "MovablePoint{x: "+ x +
                ", y: "+ y +
                ", xSpeed: "+ xSpeed +
                ", ySpeed: "+ ySpeed + "}";
    }
}
