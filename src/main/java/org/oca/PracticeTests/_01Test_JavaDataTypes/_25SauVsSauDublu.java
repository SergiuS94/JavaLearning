package org.oca.PracticeTests._01Test_JavaDataTypes;

public class _25SauVsSauDublu {


    /**
     * || daca prima conditie defineste rezultatul final nu se va executa si a doua
     * | se executa ambele conditii
     */
    public static void main(String[] args) {
        int height = 2, length = 3;
        System.out.println("h:"+height + " l:" + length);
        boolean w = height > 1 | --length < 4;
        System.out.println("h:"+height + " l:" + length);
        var x = height != 2 ? length++ : height;
        System.out.println("h:"+height + " l:" + length);
    }

}
