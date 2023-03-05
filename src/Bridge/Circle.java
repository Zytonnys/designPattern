package Bridge;

public class Circle implements iShape_bridge {
    @Override
    public void ShpeType_iShape() {
        System.out.printf("Circle::ShpeType_iShape");
    }

    @Override
    public void ShpeColor_iShape() {
        System.out.printf("Circle::ShpeColor_iShape");
    }
}
