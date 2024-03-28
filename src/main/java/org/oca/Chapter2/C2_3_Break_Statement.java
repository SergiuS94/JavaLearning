package org.oca.Chapter2;

public class C2_3_Break_Statement {
    public static void main(String[] args) {
        int x = 20;
        while (x > 5) {
            x--;
            if (x == 8)
                break;
        }
        System.out.println("x=" + x);
    }
}
