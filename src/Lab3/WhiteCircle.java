package Lab3;

public class WhiteCircle extends AbstractCircle{
    public static final String COLOR = "WHITE";

    public String getColor(){return this.COLOR;}

    public WhiteCircle() {super();}

    public WhiteCircle(int centerX, int centerY, int radius) {
        super(centerX, centerY, radius);
    }
}
