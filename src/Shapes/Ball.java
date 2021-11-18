package Shapes;

public class Ball  extends SolidOfRevolition{
    public  Ball(double radius){
        super(radius);
    }
    @Override
    public double getVolume(){
        return 4.0/3 * Math.PI * Math.pow(getRadius(),3);
    }
}
