package Decorator;

public class Main {
    public static void main(String[] args) {
        iShape circle = new Circle();
        iShape redCircle = new RedShapeDecorator(new Circle());

        iShape square = new Square();
        iShape blieSquare = new BlueShapeDecorator(new Square());

        System.out.println("Circle with normal border...");
        circle.drawShape();

        System.out.println("Circle with red border...");
        redCircle.drawShape();

        System.out.println("*****************************");

        System.out.println("Circle with normal border...");
        square.drawShape();

        System.out.println("Circle with red border...");
        blieSquare.drawShape();
    }
}
