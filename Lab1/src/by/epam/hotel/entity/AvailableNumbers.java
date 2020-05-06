package by.epam.hotel.entity;

import java.util.Date;
import java.util.Objects;

public class AvailableNumbers {
    private int numberPackages;
    private String classApartament;
    private int cost;
    private Date date;
    private int id;

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
    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDate(int cost) {
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberPackages, classApartament, date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvailableNumbers availableNumbers = (AvailableNumbers) o;
        return numberPackages == availableNumbers.numberPackages &&
                classApartament == availableNumbers.classApartament &&
                id == availableNumbers.id &&
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
        sb.append(", id= ").append(id);
        sb.append('}');
        return sb.toString();
    }
}
