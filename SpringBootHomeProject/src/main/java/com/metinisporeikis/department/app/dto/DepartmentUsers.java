package com.metinisporeikis.department.app.dto;

public class DepartmentUsers {
    private int id;
    private String department_name;
    private String name;
    private String surname;
    private String rank;
    private String email;
    private int phone;

    public DepartmentUsers() {
    }

    public DepartmentUsers(int id, String department_name, String name, String surname, String rank, String email, int phone) {
        this.id = id;
        this.department_name = department_name;
        this.name = name;
        this.surname = surname;
        this.rank = rank;
        this.email = email;
        this.phone = phone;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}




