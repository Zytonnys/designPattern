package Bridge;

public class ShapeType extends ShapeBridge {

    public ShapeType(iShape_bridge sb) {
        super(sb);
    }

    @Override
    void drawShape_ShapeBridge() {
        System.out.println("iShape_bridge::ShapeType");
        sb.ShpeType_iShape();
    }

    @Override
    void fillColor_ShapeBridge() {

    }
}
