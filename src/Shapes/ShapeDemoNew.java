package Shapes;

public class ShapeDemoNew {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Ball(5),
                new Pyramid(20, 8),
                new Cylinder(20, 10),
        };
        overrideDemo(shapes);

        Box box = new Box(1500);

        for (int i=0;i< shapes.length;i++){
            boolean result = box.add(shapes[i]);
            System.out.println(result);
        }
    }

    public static void overrideDemo(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            Shape shape = shapes[i];
            System.out.printf("%s - %s mm3\n", shape.getClass().getSimpleName(), shape.getVolume());
        }
    }
}