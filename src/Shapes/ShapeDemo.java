package Shapes;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes={
                new Ball(5),
                new Pyramid(20,8),
                new Cylinder(20,10),
        };
        overrideDemo(shapes);
    }
    public static void overrideDemo(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.printf("%s - %s mm3\n", shape.getClass().getSimpleName(), shape.getVolume());
        }
    }
}