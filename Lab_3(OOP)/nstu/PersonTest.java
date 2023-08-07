package com.nstu;

public class PersonTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rubaiyat");
        s.address = "Dhaka";
        s.setProgram("BSSE");
        s.setYear(2021);
        s.setFee(1500.0);
        s.showStudentInfo();

        Staff St = new Staff();
        St.setName("Abdullah");
        St.address = "Maijdee,Noakhali";
        St.setSchool("X School");
        St.setPay(5000);
        St.showInfo();
    }

}
