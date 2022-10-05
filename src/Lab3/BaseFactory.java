package Lab3;

public abstract class BaseFactory implements AbstractFactory<BaseFactory>{
    public void getCircle(){}

    @Override
    public BaseFactory getFactory() {
        return null;
    }

    public void getTriangle(){}
}
