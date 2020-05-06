package by.epam.hotel;

import by.epam.hotel.entity.ApplicationForm;
import by.epam.hotel.entity.Client;
import by.epam.hotel.Exceptions.ServiceException;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        ApplicationForm applicationForm = new ApplicationForm(5, "Bisnes", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("11.06.2015 11:15"));
        Client client = new Client(1, "Artem", "04129412fdsf", "Petraschka", "petraschkaprod@gmail.com", "Petraschka");

    }
}