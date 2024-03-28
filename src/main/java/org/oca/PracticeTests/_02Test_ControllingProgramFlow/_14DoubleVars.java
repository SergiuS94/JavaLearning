package org.oca.PracticeTests._02Test_ControllingProgramFlow;

public class _14DoubleVars {
    public static void main(String[] args) {
        double a = 5;
        System.out.println(a);
        float b = 6;
        b = 3;
        System.out.println(b);

        int var1 = 10;
        final int var2 = 5;
        switch (var1) {
            default:
                System.out.println("home");
                break;
            case var2://O variabila se poate folosi ca si case numai daca e final!!
                System.out.println("Away");
                break;
        }

    }
}
