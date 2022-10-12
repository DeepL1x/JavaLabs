package Lab3;
public abstract class AbstractCircle implements Geometric {

    private int centerX;
    private int centerY;
    private int radius;

    /*
    *Constructor without parameters create circle
    *in the origin of coordinates with radius 1.
    */
    public AbstractCircle(){
        this.centerX = 0;
        this.centerY = 0;
        this.radius = 1;
    }

    public AbstractCircle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
}
