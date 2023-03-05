package Decorator;

public class Triangle implements iShape {
    @Override
    public void drawShape() {
        System.out.printf("iShape::Triangle");
    }
}
