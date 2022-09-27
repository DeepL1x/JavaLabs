package Lab2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> arr = new ArrayList<>();
        arr.add(new Car(
                1,
                "Mazda",
                "M5",
                2010,
                "green",
                69999.99,
                "123456",
                2015));
        Printer.printWithBrand(arr, "Mazda");
        Printer.printWithBrand(arr, "Mercedes");
        Printer.printWithModelAndExploitationYear(arr,"M5", 4);
        Printer.printWithModelAndExploitationYear(arr,"M5", 8);
        Printer.printWithMfcYearAndPriceAbove(arr, 2010, 60000.);
        Printer.printWithMfcYearAndPriceAbove(arr, 2010, 70000.);
    }
}
