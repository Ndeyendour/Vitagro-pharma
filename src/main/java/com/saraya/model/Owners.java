package com.saraya.model;

public class Owners {
    private String firstName;
    private String lastname;
    private String address;
    private String city;
    private String telephone;
    private Pet pets;

    public Owners() {
    }

    public Owners(String firstName, String lastname, String address, String city, String telephone, Pet pets) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Pet getPets() {
        return pets;
    }

    public void setPets(Pet pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Owners{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", telephone='" + telephone + '\'' +
                ", pets=" + pets +
                '}';
    }
}
