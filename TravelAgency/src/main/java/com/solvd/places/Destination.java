package com.solvd.places;

public class Destination extends Location {
    private boolean requiresVaccination;
    private boolean requiresVisa;

    public Destination(String continent, String country, boolean requiresVaccination, boolean requiresVisa) {
        super(continent, country);
        this.requiresVaccination = requiresVaccination;
        this.requiresVisa = requiresVisa;
    }

    public Destination(String continent, String country) {
        super(continent, country);
    }

    public boolean isRequiresVaccination() {
        return requiresVaccination;
    }

    public void setRequiresVaccination(boolean requiresVaccination) {
        this.requiresVaccination = requiresVaccination;
    }

    public boolean isRequiresVisa() {
        return requiresVisa;
    }

    public void setRequiresVisa(boolean requiresVisa) {
        this.requiresVisa = requiresVisa;
    }
}
