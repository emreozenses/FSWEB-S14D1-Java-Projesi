package com.workintech.modul;

import java.util.Arrays;

public class HRManager extends Employee{

   private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper;



    public HRManager(long id, String name,JuniorDeveloper[] juniorDeveloper,MidDeveloper[] midDeveloper,SeniorDeveloper[] seniorDeveloper) {
        super(id, name);
        this.juniorDeveloper = juniorDeveloper;
        this.midDeveloper = midDeveloper;
        this.seniorDeveloper = seniorDeveloper;
    }
    @Override
    public void work() {
        System.out.println(getName()+" HR Manager starts to working");
        setSalary(60000);
    }


    public void addEmployee(int index,JuniorDeveloper juniorDeveloper){
        try {
            if (this.juniorDeveloper[index] == null) {
                this.juniorDeveloper[index] = juniorDeveloper;
            } else {
                System.out.println("Index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("index not found: "+index);
        }


    }
    public void addEmployee(int index,MidDeveloper midDeveloper){
        try {
            if (this.midDeveloper[index] == null) {
                this.midDeveloper[index] = midDeveloper;
            } else {
                System.out.println("Index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("index not found: "+index);
        }


    }
    public void addEmployee(int index,SeniorDeveloper seniorDeveloper){
        try {
            if (this.seniorDeveloper[index] == null) {
                this.seniorDeveloper[index] = seniorDeveloper;
            } else {
                System.out.println("Index is full");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("index not found: "+index);
        }


    }

    @Override
    public String toString() {
        return super.toString() + "HRManager{" +
                "juniorDeveloper=" + Arrays.toString(juniorDeveloper) +
                ", midDeveloper=" + Arrays.toString(midDeveloper) +
                ", seniorDeveloper=" + Arrays.toString(seniorDeveloper) +
                '}';
    }
}
