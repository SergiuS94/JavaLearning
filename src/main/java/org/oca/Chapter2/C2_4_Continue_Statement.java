package org.oca.Chapter2;

public class C2_4_Continue_Statement {
    public static void main(String[] args) {
        int sum = 0;
        FIRST_LOOP:
        for (int i = 0; i < 10; i++) {
            SECOND_LOOP:
            for (int j = 0; j < 10; j++) {
                sum++;
            }
        }
        System.out.println("The sum is:" + sum);
        //Using continue, will finish the execution of the current loop
        sum = 0;
        FIRST_LOOP:
        for (int i = 0; i < 10; i++) {
            SECOND_LOOP:
            for (int j = 0; j < 10; j++) {
                if(j==9)
                    continue;
                sum++;
            }
        }
        System.out.println("The sum is:" + sum);
    }
}
