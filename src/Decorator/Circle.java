package Decorator;

public class Circle implements iShape {
    @Override
    public void drawShape() {
        System.out.println("iShape::Circle");
    }
}
