package by.epam.hotel.entity;

import by.epam.hotel.collections.Gender;

import java.util.Date;

public class Client extends User{
    private int age;
    private Gender gender;
    private String classApartament;
    private int numberPerson;
    private Date date;

    public Client(){
        super();
    }

    public Client(String firstName, String lastName, String phoneNumber, int age, Gender gender, String classApartament, int numberPerson, Date date) {
        super(firstName, lastName, phoneNumber);
        this.age = age;
        this.gender = gender;
        this.classApartament = classApartament;
        this.numberPerson = numberPerson;
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getClassApartament() {
        return classApartament;
    }

    public void setClassApartament(String classApartament) {
        this.classApartament = classApartament;
    }

    public int getNumberPerson() {
        return numberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        this.numberPerson = numberPerson;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Client that = (Client) obj;
        return that.age == age &&
                that.gender == gender &&
                that.classApartament == classApartament &&
                that.numberPerson == numberPerson;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name: " + getFirstName() +
                "; surname: " + getLastName() +
                "; phone number: " + "+" + getPhoneNumber() +
                "; age: " + age +
                "; gender: " + gender +
                "; class of apartamnet: " + classApartament +
                "; date of seats: " + date +
                "; number of person: '" + numberPerson + '\'' +
                '}';
    }
}