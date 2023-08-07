package com.nstu;

public class PetTest {

    public static void main(String[] args) {
        Cat p1 = new Cat();
        Fish p2 = new Fish();

        p1.setName("Tommy");
        System.out.println("Cat name is : " + p1.getName());
        p1.play();
        p1.Eat();

        p2.setName("Dory");
        System.out.println("Fish name is : " + p2.getName());
        p2.play();

    }
}
