package Lab3;

public class WhiteFactory extends BaseFactory {

    @Override
    public void getCircle() {
    }

    @Override
    public void getTriangle() {
    }

    @Override
    public WhiteFactory getFactory() {
        return new WhiteFactory();
    }
}
