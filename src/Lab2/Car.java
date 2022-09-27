package Lab2;

public class Car {
    private final Integer id;
    private final String brand;
    private final String model;
    private final Integer mfcYear;
    private final Integer pchsYear;
    private final String color;
    private final Double price;
    private final String regId;

    public Car(Integer id,
               String brand, String model,
               Integer mfcDate,
               String color,
               Double price,
               String regId, Integer pchsDate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.mfcYear = mfcDate;
        this.color = color;
        this.price = price;
        this.regId = regId;
        this.pchsYear = pchsDate;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Integer getMfcYear() {
        return mfcYear;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }

    public String getRegId() {
        return regId;
    }

    public Integer getPchsYear() {
        return pchsYear;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mfcDate=" + mfcYear +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regId='" + regId + '\'' +
                ", pchsDate=" + pchsYear;
    }
}
