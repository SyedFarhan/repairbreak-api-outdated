package com.repairbreak;

public class Technician {
    private String name;
    private String number;
    private String availability;

    public Technician(String name, String number) {
        this.name = name;
        this.number = number;
        this.availability = "Open";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
