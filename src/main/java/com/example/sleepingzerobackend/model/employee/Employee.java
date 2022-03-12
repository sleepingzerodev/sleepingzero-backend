package com.example.sleepingzerobackend.model.employee;


import java.io.Serializable;


public class Employee implements Serializable {

    private long id;

    private String firstName;

    public Employee(long id, String firstName, String lastName, String email, String qualification, String designation, long phoneNumber, long salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.qualification = qualification;
        this.designation = designation;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    private String lastName;

    private String email;

    private String qualification;

    private String designation;

    private long phoneNumber;

    private long salary;

    public Employee(){ }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDesignation() {
        return designation;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", designation='" + designation + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                '}';
    }

}
