package Lab3;

public abstract class AbstractTriangle implements Geometric {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public AbstractTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    @Override
    public double getArea() {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) +
                x3 * (y1 - y2)) / 2.0);
    }

    @Override
    public double getPerimeter() {
        double lengthA = findDistance(x1, y1, x2, y2);
        double lengthB = findDistance(x2, y2, x3, y3);
        double lengthC = findDistance(x3, y3, x1, y1);

        return lengthA+lengthB+lengthC;
    }

    private static double findDistance(int x1, int y1, int x2, int y2){
        return Math.hypot( x2 - x1, y2 - y1 );
    }
}
