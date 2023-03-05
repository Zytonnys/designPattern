package Bridge;

public class Red implements iShape_bridge {
    @Override
    public void ShpeType_iShape() {
        System.out.printf("RedTriangle::ShpeType_iShape");
    }

    @Override
    public void ShpeColor_iShape() {
        System.out.printf("RedTriangle::ShpeType_iShape");
    }
}
