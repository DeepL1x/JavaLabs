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
        if (!checkProperties())
            System.out.println("Incorrect input. That's not a circle!\nTry to change radius.");
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

    /*
     * This method checks if given points make a circle.
     * If radius is positive, then it's a circle.
     */
    @Override
    public boolean checkProperties() {
        if (radius > 0)
            return true;
        return false;
    }
}
