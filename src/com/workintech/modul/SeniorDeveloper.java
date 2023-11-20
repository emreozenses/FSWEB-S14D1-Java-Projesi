package com.workintech.modul;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(getName()+" Senior Developer starts to working");
        setSalary(80000);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
}
