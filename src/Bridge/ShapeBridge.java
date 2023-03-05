package Bridge;

public abstract class ShapeBridge {
    protected iShape_bridge sb;

    public ShapeBridge(iShape_bridge sb) {
        this.sb = sb;
    }
    abstract void drawShape_ShapeBridge();
    abstract void fillColor_ShapeBridge();
}
