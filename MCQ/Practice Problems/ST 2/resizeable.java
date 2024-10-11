
interface GeometricObject {
    double getArea();
    double getPerimeter();
}

class Circle implements GeometricObject 
{
    protected double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double getArea() 
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() 
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() 
    {
        return "Circle(radius= " + radius + ", area= " + getArea() + ", perimeter= " + getPerimeter() + ")";
    }
}

interface Resizable {
    void resize(int percent);
}

class ResizableCircle extends Circle implements Resizable 
{
    public ResizableCircle(double radius) 
    {
        super(radius);
    }

    @Override
    public void resize(int percent) 
    {
        radius *= (1 + percent / 100.0);
    }

    @Override
    public String toString() 
    {
        return "ResizableCircle(radius= " + radius + ", area= " + getArea() + ", perimeter= " + getPerimeter() + ")";
    }
}


public class resizeable {
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5.0);
        System.out.println(circle);

        ResizableCircle resizableCircle = new ResizableCircle(5.0);
        System.out.println("Before resizing: " + resizableCircle);

        resizableCircle.resize(50);
        System.out.println("After resizing by 50%: " + resizableCircle);

        resizableCircle.resize(-20);
        System.out.println("After resizing by -20%: " + resizableCircle);
    }
}