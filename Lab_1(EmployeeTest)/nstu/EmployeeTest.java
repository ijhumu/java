package com.nstu;

public class EmployeeTest {

    public static void main(String[] args) {

        Full_Employee f1=new Full_Employee();
        f1.firstname="Rubaiyat";
        f1.lastname="Mumu";
        f1.monthlySalary=20000;
        f1.experienceYear=5;
        f1.show_details();
        System.out.println("Incremented Salary for full time employee : "+f1.cal_increment());

        Full_Employee f2=new Full_Employee();
        f2.firstname="Israt";
        f2.lastname="Jahan";
        f2.monthlySalary=5000;
        f2.experienceYear=1;
        f2.show_details();
        System.out.println("Incremented Salary for full time employee : "+f2.cal_increment());

        Full_Employee f3=new Full_Employee();
        f3.firstname="Manhbuba";
        f3.lastname="Rumu";
        f3.monthlySalary=15000;
        f3.experienceYear=3;
        f3.show_details();
        System.out.println("Incremented Salary for full time employee : "+f3.cal_increment());

        Full_Employee f4=new Full_Employee();
        f4.firstname="Taposhi";
        f4.lastname="Rabeya";
        f4.monthlySalary=30000;
        f4.experienceYear=12;
        f4.show_details();
        System.out.println("Incremented Salary for full time employee : "+f4.cal_increment());


        Part_Employee p1=new Part_Employee();
        p1.firstname="Abdullah";
        p1.lastname="Shahriar";
        p1.salary=10000;
        p1.workingHour=5;
        p1.workingYear=1;
        p1.show_details();
        System.out.println("Incremented Salary for part time employee : "+p1.cal_increment());

        Part_Employee p2=new Part_Employee();
        p2.firstname="Hasan";
        p2.lastname="Shuvo";
        p2.salary=25000;
        p2.workingHour=5;
        p2.workingYear=3;
        p2.show_details();
        System.out.println("Incremented Salary for part time employee : "+p2.cal_increment());

        Part_Employee p3=new Part_Employee();
        p3.firstname="Pritam";
        p3.lastname="Sen";
        p3.salary=30000;
        p3.workingHour=5;
        p3.workingYear=4;
        p3.show_details();
        System.out.println("Incremented Salary for part time employee : "+p3.cal_increment());


    }
}