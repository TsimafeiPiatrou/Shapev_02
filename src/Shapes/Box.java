package Shapes;

public class Box extends Shape {

    private double value;

    public Box(double value){
        this.value=value;
    }

    public boolean add(Shape shapes) {
        if (value >= shapes.getVolume()) {
            value -= shapes.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
