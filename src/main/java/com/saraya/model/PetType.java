package com.saraya.model;

public class PetType {
    private String name;

    public PetType() {
    }

    public PetType(String name) {
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
