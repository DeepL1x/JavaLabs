package Lab3;
public class BlackFactory extends BaseFactory {
    @Override
    public AbstractCircle getCircle(int centerX, int centerY, int radius) {
        return new BlackCircle(centerX, centerY, radius);
    }
    @Override
    public AbstractCircle getCircle() {
        return new BlackCircle();
    }
    @Override
    public AbstractTriangle getTriangle() {
        return new BlackTriangle();
    }
    public BlackTriangle getTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        return new BlackTriangle(x1, y1, x2, y2, x3, y3);
    }
}