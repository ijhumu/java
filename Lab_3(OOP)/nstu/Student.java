package com.nstu;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    String getProgram() {
        return program;
    }

    void setProgram(String program) {
        this.program = program;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    double getFee() {
        return fee;
    }

    void setFee(double fee) {
        this.fee = fee;
    }

    void showStudentInfo() {
        System.out.println("\nStudent's Name: " + getName()+"\nAddress: " + address+"\nProgram: " + program+"\nYear: " + year+"\nFees: " + fee);

    }

}
