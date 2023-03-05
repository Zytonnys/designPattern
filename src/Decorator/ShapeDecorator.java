package Decorator;

public class ShapeDecorator implements iShape {
    protected iShape iShape;

    public ShapeDecorator(Decorator.iShape iShape) {
        this.iShape = iShape;
    }
    @Override
    public void drawShape() {
        iShape.drawShape();
    }
}
