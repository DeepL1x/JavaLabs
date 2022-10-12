package Lab3;

public class Printer {
    public void printArea(Geometric object)
    {
        System.out.println("Area is "+ object.getArea());
    }
    public void printPerimeter(Geometric object)
    {
        System.out.println("Perimeter is "+ object.getPerimeter());
    }

    public void printColor(Geometric object)
    {
        System.out.println("The color is " + object.getColor());
    }

    public void printInfo(Geometric object){
        System.out.println("Area is "+ object.getArea() +", perimeter is "+ object.getPerimeter()+", color is " + object.getColor());
    }

}
