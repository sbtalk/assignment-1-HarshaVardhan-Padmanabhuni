package com.demo;

public class Main {
    static void main() {
        Employee emp = new Employee(1,"HARSHA",100000.0);
        Manager mgr = new Manager(2,"Bob",120000.0,5000.0);
        System.out.println("PARENT CLASS");
        emp.display();
        System.out.println("CHILD CLASS");
        mgr.display();
    }
}
