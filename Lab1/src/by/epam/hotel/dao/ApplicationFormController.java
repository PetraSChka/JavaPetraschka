package by.epam.hotel.dao;

import by.epam.hotel.entity.ApplicationForm;

public class ApplicationFormController extends Controller<ApplicationForm>{
        private static final String dir = "data/ApplicationForm.dat";

        @Override
        public String getDir() {
            return dir;
        }
}
