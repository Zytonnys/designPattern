package Bridge;

public class Main {
 public static void main(String[] args) {
     ShapeBridge square = new ShapeType(new Square());
     ShapeBridge triangle = new ShapeType(new Triangle());
     square.drawShape_ShapeBridge();
     System.out.println("****************");
     triangle.drawShape_ShapeBridge();
     ShapeBridge redTriangle = new Color(new Red());
     redTriangle.drawShape_ShapeBridge();
     redTriangle.fillColor_ShapeBridge();
   }
}
