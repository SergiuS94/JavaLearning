package org.oca.PracticeTests._02Test_ControllingProgramFlow;

import java.util.List;

public class _04DefinitieListe {

    public static void main(String[] args) {
        int[] a = new int[]{3};//definesti direct valorile, in acest caz 1 singura
        System.out.println("a= " + a[0]);
        List b = List.of("3", "4c"); //List of creeaza o lista din elementele date
        System.out.println("b= " + b);
    }

}
