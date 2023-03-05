package Bridge;

public class Color extends ShapeBridge {
    public Color(iShape_bridge sb) {
        super(sb);
    }
    @Override
    public void drawShape_ShapeBridge() {
    }

    @Override
    public void fillColor_ShapeBridge() {
        System.out.println("iShape_bridge::Color");
        sb.ShpeType_iShape();
    }
}
