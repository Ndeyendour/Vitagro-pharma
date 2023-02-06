package com.saraya.model;

public class Vet {


    private String firstName;
    private String lastName;
    private Speciality specialities;

    public Vet(String firstName, String lastName, Speciality specialities) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialities = specialities;
    }

    public Vet() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Speciality getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Speciality specialities) {
        this.specialities = specialities;
    }

    @Override
    public String toString() {
        return "Vet{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialities=" + specialities +
                '}';
    }
}
