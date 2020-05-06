package by.epam.hotel.dao;

import by.epam.hotel.entity.Order;

public class OrderController extends Controller<Order> {
    private static final String dir = "data/order.dat";

    public OrderController() {
    }

    public String getDir() {
        return "data/order.dat";
    }
}
