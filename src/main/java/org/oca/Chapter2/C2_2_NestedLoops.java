package org.oca.Chapter2;

public class C2_2_NestedLoops {
    public static void main(String[] args) {
        int x = 20;
        OUTER_LOOP: //this is an optional label
        while (x > 0) {
            INNER_LOOP: //this is an optional label
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.println(x + "\t");
        }
    }
}
