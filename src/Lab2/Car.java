package Lab2;

public class Car {
    private final Integer id;
    private final String brand;
    private final String model;
    private final Date mfcYear;
    private final Date pchsYear;
    private final String color;
    private final Double price;
    private final String regId;

    public Car(Integer id,
               String brand, String model,
               Integer mfcDay, Integer mfcMonth, Integer mfcYear,
               String color,
               Double price,
               String regId,
               Integer pchsDay, Integer pchsMonth, Integer pchsYear) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.mfcYear = new Date(mfcDay, mfcMonth, mfcYear);
        this.color = color;
        this.price = price;
        this.regId = regId;
        this.pchsYear = new Date(pchsDay, pchsMonth, pchsYear);
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Integer getMfcYear() {
        return mfcYear.getYear();
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

    public Date getPchsDate(){
        return pchsYear;
    }

    public Integer getPchsYear() {
        return pchsYear.getYear();
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
