package by.epam.hotel.entity;

public class Order {
    private Client client;
    private HotelRoom hotelRoom;
    private int day;
    private int id;

    public Order() {   }

    public Order(Client client, HotelRoom hotelRoom, int day, int id) {
        this.client = client;
        this.hotelRoom = hotelRoom;
        this.day = day;
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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
        Order that = (Order) obj;
        return that.client == client &&
                that.hotelRoom == hotelRoom &&
                that.day == day &&
                that.id == id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name: " + client.getFirstName() +
                "; surname: " + client.getLastName() +
                "; number phone: " + client.getPhoneNumber() +
                "; age: " + client.getAge() +
                "; gender: " + client.getGender() +
                "; driving experience: " + client.getClassApartament() +
                "; category: " + client.getNumberPerson() +
                "; model: " + hotelRoom.getClassApartament() +
                "; year of hotelRoom manufacture: " + hotelRoom.getNumberSeats() +
                "; hotelRoom id: " + hotelRoom.getId() +
                "; price: " + hotelRoom.getPrice() +
                "; day: " + day +
                '}';
    }
}