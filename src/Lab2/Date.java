package Lab2;

public class Date {
    private final Integer day;
    private final Integer month;
    private final Integer year;

    Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}
