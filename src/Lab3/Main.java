package Lab3;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

//        BaseFactory blackFactory = new BaseFactory();
        BaseFactory blackFactory = AbstractFactory.getFactory("black");
        AbstractCircle blackCircle = blackFactory.getCircle();
        printer.printInfo(blackCircle);

//        BaseFactory whiteFactory = new BaseFactory();
        BaseFactory whiteFactory = AbstractFactory.getFactory("white");
        AbstractTriangle whiteTriangle = whiteFactory.getTriangle();
        printer.printInfo(whiteTriangle);




    }
}