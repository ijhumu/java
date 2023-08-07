package com.nstu;

public class Savings_Account extends Bank {

    void calculateInterest(double savings) {
        double total = savings;
        total  = total  + (total  * 0.045);
        System.out.println("Total savings with interest 4.5% is :" + total );
    }

}
