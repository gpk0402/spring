package com.epam.enums;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Color favoriteColor; // New field for favorite color

    // Constructor
    public Employee(int id, String name, double salary, Color favoriteColor) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.favoriteColor = favoriteColor;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Color getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(Color favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    // Override toString() method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", favoriteColor=" + favoriteColor +
                '}';
    }
}



