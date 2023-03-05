package Bridge;

public class Square implements iShape_bridge {
    @Override
    public void ShpeType_iShape() {
        System.out.printf("Square::ShpeType_iShape");
    }

    @Override
    public void ShpeColor_iShape() {
        System.out.printf("Square::ShpeColor_iShape");
    }
}
