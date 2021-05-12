package com.nstu;

public class Part_Employee {
    String firstname;
    String lastname;
    double salary;
    int workingHour;
    int workingYear;

    void show_details(){
        System.out.println("\nFirst name : "+firstname+"\nLast name  : "+lastname+"\nMonthly salary : "+salary+"\nWorking Hour : "+workingHour+"\nWorking Year : "+workingYear);

    }
    double cal_increment(){

        double incrementsalary=0;

        if(workingHour<5 && workingYear<2)
        {
            incrementsalary=salary+(salary*0.02);
        }
        else if(workingHour==5 && workingYear<2)
        {
            incrementsalary=salary+(salary*0.03);
        }
        else if(workingHour==5 && workingYear>2)
        {
            incrementsalary=salary+(salary*0.05);
        }

        return incrementsalary;

    }

}