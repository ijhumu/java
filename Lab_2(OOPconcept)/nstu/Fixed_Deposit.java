package com.nstu;

public class Fixed_Deposit extends Bank {

    void calculateInterest(double savings) {
        double total = savings;
        total = total + (total * 0.06);
        System.out.println("Total savings with interest 6% is :" + total);
    }

}
