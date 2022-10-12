package Lab3;


public class WhiteFactory extends BaseFactory {
    @Override
    public AbstractCircle getCircle() {
        return new WhiteCircle();
    }
    @Override
    public AbstractCircle getCircle(int centerX, int centerY, int radius) {
        return new WhiteCircle(centerX, centerY, radius);
    }
    @Override
    public AbstractTriangle getTriangle() {
        return new WhiteTriangle();
    }
    @Override
    public AbstractTriangle getTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        return new WhiteTriangle(x1, y1, x2, y2, x3, y3);
    }
}