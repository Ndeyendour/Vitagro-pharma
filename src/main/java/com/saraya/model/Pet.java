package com.saraya.model;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate dateOfBirth;
    private PetType petType;
    private Visit visits;

    public Pet() {
    }

    public Pet(String name, LocalDate dateOfBirth, PetType petType, Visit visits) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.petType = petType;
        this.visits = visits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Visit getVisits() {
        return visits;
    }

    public void setVisits(Visit visits) {
        this.visits = visits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", petType='" + petType + '\'' +
                ", visits=" + visits +
                '}';
    }
}
