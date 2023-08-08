package module_2.l_13.factory;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
       return new Circle();
    }
}
