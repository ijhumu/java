package com.nstu;

public class Staff extends Person {
    private String School;
    private double pay;

    void setPay(double pay) {
        this.pay = pay;
    }

    double getPay() {
        return pay;
    }

    void setSchool(String School) {
        this.School = School;
    }

    String getSchool() {
        return School;
    }

    void showInfo() {
        System.out.println("\nStaff's Name:" + getName()+"\nSchool:" + School+"\nPay:" + pay);

    }

}
