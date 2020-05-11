package by.epam.hotel.service;

import java.util.Date;
import java.util.Objects;

public class AvailableNumbersService {
    private int numberPackages;
    private String classApartament;
    private int cost;
    private Date date;

    public int getNumberPackages() {
        return numberPackages;
    }

    public void setNumberPackages(int numberPackages) {
        this.numberPackages = numberPackages;
    }

    public String getClassApartament() {
        return classApartament;
    }

    public void setClassApartament(String classApartament) {
        this.classApartament = classApartament;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setDate(int cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberPackages, classApartament, date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvailableNumbersService availableNumbers = (AvailableNumbersService) o;
        return numberPackages == availableNumbers.numberPackages &&
                classApartament == availableNumbers.classApartament &&
                Objects.equals(cost, availableNumbers.cost) &&
                Objects.equals(date, availableNumbers.date);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numberPackages=").append(numberPackages);
        sb.append(", classApartament= ").append(classApartament);
        sb.append(", date= ").append(date);
        sb.append(", cost= ").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
