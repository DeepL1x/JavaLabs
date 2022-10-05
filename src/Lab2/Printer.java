package Lab2;

import java.util.ArrayList;

public class Printer {
    public static void printWithBrand(ArrayList<Car> arr, String brand) {
        System.out.println("Cars with brand: " + brand);

        for (Car i : arr) {
            if (i.getBrand().equals(brand))
                System.out.println(i);
        }
    }

    public static void printWithModelAndExploitationYear(ArrayList<Car> arr, String model, Integer years) {
        System.out.println("Cars with model: " + model + " and exploitation years: " + years);

        for (Car i : arr) {
            if (i.getModel().equals(model) && (new Date()).isGreaterByYears(i.getPchsDate(), years))
                System.out.println(i);
        }
    }

    public static void printWithMfcYearAndPriceAbove(ArrayList<Car> arr, Integer mfcYear, Double price) {
        System.out.println("Cars with manufacturing year: " + mfcYear + " and price above: " + price);

        for (Car i : arr) {
            if (i.getMfcYear().equals(mfcYear) && i.getPrice() > price)
                System.out.println(i);
        }
    }
}
