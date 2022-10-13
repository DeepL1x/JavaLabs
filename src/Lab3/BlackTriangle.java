package Lab3;

public class BlackTriangle extends AbstractTriangle{

    public static final String COLOR = "BLACK";

    public BlackTriangle() {super();}

    public BlackTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public String getColor() {
        return null;
    }
}
