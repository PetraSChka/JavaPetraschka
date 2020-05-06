package by.epam.hotel.service;

import java.util.Date;
import java.util.Objects;

public class ApplicationFormService {
    private int numberPackages;
    private String classApartament;
    private Date date;

    public ApplicationFormService() {
    }

    public ApplicationFormService(int numberPackages, String classApartament, Date date) {
        this.numberPackages = numberPackages;
        this.classApartament = classApartament;
        this.date=date;
    }

    public int getNumberPackages() {
        return numberPackages;
    }
    public void setNumberPackages(int numberPackages) {
        this.numberPackages= numberPackages;
    }

    public String getClassApartament() {
        return classApartament;
    }
    public void setClassApartament(String classApartament) {
        this.classApartament= classApartament;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date= date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberPackages, classApartament, date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplicationFormService applicationForm = (ApplicationFormService) o;
        return numberPackages == applicationForm.numberPackages &&
                classApartament == applicationForm.classApartament &&
                Objects.equals(date, applicationForm.date);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numberPackages=").append(numberPackages);
        sb.append(",  classApartament= ").append(classApartament);
        sb.append(", date= ").append(date);
        sb.append('}');
        return sb.toString();
    }
}