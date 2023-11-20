package com.workintech.modul;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    public void work() {
        System.out.println(getName()+" Mid Developer starts to working");
        setSalary(60000);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
}

