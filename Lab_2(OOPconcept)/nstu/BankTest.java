package com.nstu;

public class BankTest {
    public static void main(String[] args) {


        Savings_Account a1 = new Savings_Account();
        Fixed_Deposit a2 = new Fixed_Deposit();
        DPS a3 = new DPS();

        a1.name="A Bank";
        a1.address="Road A";
        a1.branch=3;
        a1.showInfo();
        a1.calculateInterest(20000);
        a2.name="A Bank";
        a2.address="Road B";
        a2.branch=6;
        a2.showInfo();
        a2.calculateInterest(20000);
        a3.name="A Bank";
        a3.address="Road c";
        a3.branch=4;
        a3.showInfo();
        a3.calculateInterest(20000);

    }

}

