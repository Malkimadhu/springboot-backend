package com.Crestfield_Academy.Crestfield_Academy_Backend.dto;



public class StudentDto {
    private int id;
    private String name;
    private String address;
    private String phone;
    private int age;
    private String email;

    public StudentDto() {
    }

    // All-argument constructor
    public StudentDto(int id, String name, String address, String phone, int age, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(int age) {
        this.age = age;
    }

}
