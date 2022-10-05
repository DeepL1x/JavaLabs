package Lab3;

public class FactoryProvider {
    public static BaseFactory getFactory(String choice){
        if ("Black".equals(choice)){
            return new BlackFactory();
        }
        else if ("White".equals(choice)){
            return new WhiteFactory();
        }
        return null;
    }
}
