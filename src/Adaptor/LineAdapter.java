package Adaptor;

public class LineAdapter implements Shape {
    private Line lineAdapter;
    public LineAdapter(Line lA) {
        this.lineAdapter = lA;
    }
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        lineAdapter.draw(x1, y1, x2, y2);
    }
}
