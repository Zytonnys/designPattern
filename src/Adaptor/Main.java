package Adaptor;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new RectangleAdaptor(new Rectangle()),
                new LineAdapter(new Line())
        };
        int x1 = 10, y1 = 20, x2 = 30, y2 = 60;
        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
            System.out.println();
        }
    }
}
