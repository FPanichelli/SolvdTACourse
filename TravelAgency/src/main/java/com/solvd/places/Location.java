package com.solvd.places;

public class Location {
    private String continent;
    private String country;

    public Location(String continent, String country) {
        this.continent = continent;
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
