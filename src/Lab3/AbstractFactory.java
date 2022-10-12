package Lab3;
public class AbstractFactory  {
    public static BaseFactory getFactory(String choice){
        if ("black".equalsIgnoreCase(choice)){
            return new BlackFactory();
        }
        else if ("white".equalsIgnoreCase(choice)){
            return new WhiteFactory();
        }
        return null;
    }
}