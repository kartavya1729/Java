// public class moveable {

interface Movable 
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable 
{
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) 
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() 
    {
        y += ySpeed;
    }

    @Override
    public void moveDown() 
    {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() 
    {
        x -= xSpeed;
    }

    @Override
    public void moveRight() 
    {
        x += xSpeed;
    }

    @Override
    public String toString() 
    {
        return "MovablePoint(" + "x= " + x + ", y= " + y + ", xSpeed= " + xSpeed + ", ySpeed= " + ySpeed + ')';
    }
}

class MovableCircle implements Movable 
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) 
    {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle(center= " + center + ", radius= " + radius + ')';
    }
}

public class moveable {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(0, 0, 5, 5);

        System.out.println("Initial Point: " + point);

        point.moveRight();
        System.out.println("After moving right: " + point);

        point.moveUp();
        System.out.println("After moving up: " + point);

        MovableCircle circle = new MovableCircle(0, 0, 10, 10, 15);
        System.out.println("Initial Circle: " + circle);

        circle.moveRight();
        System.out.println("After moving right: " + circle);

        circle.moveDown();
        System.out.println("After moving down: " + circle);
    }
}