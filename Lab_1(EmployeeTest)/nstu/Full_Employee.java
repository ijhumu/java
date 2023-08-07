package com.nstu;

public class Full_Employee {
    String firstname;
    String lastname;
    double monthlySalary;
    int experienceYear;

    void show_details(){
        System.out.println("\nFirst name : "+firstname+"\nLast name  : "+lastname+"\nMonthly salary : "+monthlySalary+"\nExperienced year :"+experienceYear);

    }
    double cal_increment(){
        double incrementSalary=0;

        if(experienceYear >1 && experienceYear<=3)
        {
            incrementSalary=monthlySalary+(monthlySalary*0.05);
        }
        else if(experienceYear >3 && experienceYear<=5)
        {
            incrementSalary=monthlySalary+(monthlySalary*0.15);
        }
        else if(experienceYear>5 && experienceYear<=10)
        {
            incrementSalary=monthlySalary+(monthlySalary*0.20);
        }
        else if(experienceYear>10)
        {
            incrementSalary=(monthlySalary+(monthlySalary*0.25)+(monthlySalary/2));
        }

        return incrementSalary;
    }
}