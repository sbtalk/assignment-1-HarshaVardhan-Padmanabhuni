package com.demo;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void display(){
        System.out.println("ID: "+this.id);
        System.out.println("NAME: "+this.name);
        System.out.println("Salary: "+this.salary);
    }
}
