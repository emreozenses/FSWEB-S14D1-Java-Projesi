package com.workintech.modul;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    public void work() {
        System.out.println(getName()+"Junior Developer starts to working");
        setSalary(30000);
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }


}
