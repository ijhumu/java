package com.nstu;

public class Employee extends Person{

    private double salary;
    int year;
    private String insuranceNumber;

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public String getInsNumber(){
        return insuranceNumber;
    }
    public void setInsNumber(String insuranceNumber){
        this.insuranceNumber=insuranceNumber;
    }

    void showInfo(){
        System.out.println(" Employee name : "+getName()+"\n Salary : "+getSalary()+"\n Starting year : "+year+"\n Insurance number : "+getInsNumber());
    }


}
