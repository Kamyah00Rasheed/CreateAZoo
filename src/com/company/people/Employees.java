package com.company.people;

import java.util.List;

public class Employees extends People {

    private int employeeNumber;
    private String job;
    private String hireDate;
    private int hours;

    private List<Employees> employeesList; 


    public Employees(int age, String name, char gender, String race, int employeeNumber, String job, String hireDate) {
        super(age, name, gender, race);
        this.employeeNumber = employeeNumber;
        this.job = job;
        this.hireDate = hireDate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHireDate() {
        return hireDate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
