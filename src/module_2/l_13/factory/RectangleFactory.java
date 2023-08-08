package module_2.l_13.factory;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
