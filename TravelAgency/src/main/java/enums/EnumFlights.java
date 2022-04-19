package enums;

import com.solvd.travelagency.TravelAgency;

public enum EnumFlights {
    BELARUS_AIRWAYS(1),
    QATAR_AIR(2),
    AEROLINEAS_ARGENTINAS(3);

    int number;

    EnumFlights(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
