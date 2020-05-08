package com.metinisporeikis.department.app.dto;

public class DepartmentAddress {
    private int id;
    private int departmentsusers_id;
    private String country;
    private String city;
    private String street;

    DepartmentAddress() {
    }

    public DepartmentAddress(int id, int departmentsusers_id, String country, String city, String street) {
        this.id = id;
        this.departmentsusers_id = departmentsusers_id;
        this.country = country;
        this.city = city;
        this.street = street;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDepartmentsusers_id() {
        return departmentsusers_id;
    }

    public void setDepartmentsusers_id(int departmentsusers_id) {
        this.departmentsusers_id = departmentsusers_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}


