package Lab2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> arr = new ArrayList<>();
        arr.add(new Car(
                1,
                "Mazda",
                "M5",
                8, 7, 2010,
                "green",
                69999.99,
                "123456",
                26, 11, 2015));
        arr.add(new Car(
                2,
                "BMW",
                "X5",
                13, 4, 2010,
                "green",
                79999.99,
                "A0778",
                26, 3, 2014));
        Printer.printWithBrand(arr, "Mazda");
        Printer.printWithBrand(arr, "Mercedes");
        Printer.printWithModelAndExploitationYear(arr,"M5", 4);
        Printer.printWithModelAndExploitationYear(arr,"M5", 8);
        Printer.printWithModelAndExploitationYear(arr,"X5", 4);
        Printer.printWithModelAndExploitationYear(arr,"X5", 8);
        Printer.printWithMfcYearAndPriceAbove(arr, 2010, 60000.0D);
        Printer.printWithMfcYearAndPriceAbove(arr, 2010, 70000.0D);
    }
}
