package org.oca.PracticeTests._01Test_JavaDataTypes;

public class _02PlusPlusOrder {

    public static void main(String[] args) {
        int meal = 5;
        int tip = 2;
        int total;
//        total = meal + (meal > 6 ? tip++ : tip--);
//        System.out.println("tip=" + tip);
        total = meal > 6 ? tip++ : tip--;
        System.out.println("new tip:" + tip);
    }

}
