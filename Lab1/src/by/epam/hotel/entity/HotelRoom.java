package by.epam.hotel.entity;

public class HotelRoom extends Entity{
    private String classApartament;
    private int numberSeats;
    private double price;
    private int id;

    public HotelRoom() { }

    public HotelRoom(String classApartament, int numberSeats, double price, int id) {
        this.classApartament = classApartament;
        this.numberSeats = numberSeats;
        this.price = price;
        this.id = id;
    }

    public String getClassApartament() {return classApartament; }

    public void setClassApartament(String classApartament) {this.classApartament = classApartament; }

    public int getNumberSeats() {return numberSeats; }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        HotelRoom that = (HotelRoom) obj;
        return  that.classApartament == classApartament &&
                that.numberSeats == numberSeats &&
                Double.compare(that.price, price) == 0 &&
                that.id == id;
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "class of apartament: " + classApartament +
                "; number of seats: " + numberSeats +
                "; price: " + price+
                "; id: " + id +
                '}';
    }
}

