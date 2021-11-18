package Shapes;

public abstract class SolidOfRevolition  extends Shape{

    public double radius;

    public SolidOfRevolition(double radius) {
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}