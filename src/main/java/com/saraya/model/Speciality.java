package com.saraya.model;

public class Speciality {
    private String name;

    public Speciality() {
    }

    public Speciality(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "name='" + name + '\'' +
                '}';
    }
}
