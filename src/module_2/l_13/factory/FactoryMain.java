package module_2.l_13.factory;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory rectangleFactory = new RectangleFactory();
        ShapeFactory circleFactory = new CircleFactory();

        Shape circle = circleFactory.createShape();
        Shape rectangle = rectangleFactory.createShape();
    }
}
