package Bridge;

public class Triangle implements iShape_bridge {
    @Override
    public void ShpeType_iShape() {
        System.out.printf("Triangle::ShpeType_iShape");
    }

    @Override
    public void ShpeColor_iShape() {
        System.out.printf("Triangle::ShpeColor_iShape");
    }
}
