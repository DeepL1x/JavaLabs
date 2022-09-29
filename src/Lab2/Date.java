package Lab2;

import java.time.LocalDate;

public class Date {
    private final Integer day;
    private final Integer month;
    private final Integer year;

    Date() {
        this.year = LocalDate.now().getYear();
        this.month = LocalDate.now().getMonthValue();
        this.day = LocalDate.now().getDayOfMonth();
    }

    Date(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isGreaterByYears(Date second, Integer years) {
        if (this.year < (second.getYear() + years))
            return false;
        else if ((this.month < second.getMonth()) && (this.year - (second.getYear() + years)) == 0)
            return false;
        else if (this.day < second.getDay()  && (this.year - (second.getYear() + years)) == 0)
            return false;
        return true;
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
