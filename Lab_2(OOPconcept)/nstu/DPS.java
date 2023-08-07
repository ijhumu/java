package com.nstu;

public class DPS extends Bank {

    void calculateInterest(double savings) {
        double total = savings;
        total = total + (total * 0.04);
        System.out.println("Total savings with interest 4% is :" + total);
    }

}
