package com.epam.enums;

public enum Color {
    RED (), BLUE(), GREEN(), YELLOW();

}

enum Day {
    SUNDAY(), MONDAY("Mon"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat");

    private String abbreviation;

    private Day(){

    }

    private Day(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}

