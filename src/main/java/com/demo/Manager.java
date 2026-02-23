package com.demo;

public class Manager extends Employee{
    private Double bonus;

    public Manager(Integer id, String name, Double salary, Double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Bonus: "+this.bonus);
    }
}
