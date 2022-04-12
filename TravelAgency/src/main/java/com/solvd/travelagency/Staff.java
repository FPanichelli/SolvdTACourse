package com.solvd.travelagency;

public abstract class Staff extends People {
    private double salary;
    private char desk;


    public Staff(String name, int age, String gender, String nationality, double salary, char desk) {
        super(name, age, gender, nationality);
        this.salary = salary;
        this.desk = desk;
    }

    public Staff() {

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getDesk() {
        return desk;
    }

    public void setDesk(char desk) {
        this.desk = desk;
    }
}
