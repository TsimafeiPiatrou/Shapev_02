package Shapes;

public class Cylinder  extends SolidOfRevolition{
    public double height;

    public Cylinder(double radius,double height) {
        super(radius);
        this.height=height;
    }
    public void getHeight(){
        this.height=height;
    }

    public void setHeight(){
        this.height=height;
    }
    @Override
    public double getVolume(){
        return Math.PI * height * Math.pow(getRadius(),2);
    }
}