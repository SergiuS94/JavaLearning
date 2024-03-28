package org.oca.Chapter4._00Problems.Pb1;

public class Clasa2 {

    public static void main(String[] args) {
        Clasa1 o1 = new Clasa1();
        Clasa1 o2 = new Clasa1();
        o1.x2 = 6;
        //x2 nu e static
        System.out.println("o1:" + o1.x2 + " ,o2:" + o2.x2);


        System.out.println("Static(o1)");
        //X1 e static
        System.out.println("o1:" + o1.x1 + " ,o2:" + o2.x1);
        o1.setX1(2);
        System.out.println("Noul x1 pentru obiectul 1 e:" + o1.getX1());
        o2.setX1(10);
        System.out.println("Noul x1 pentru obiectul 2 e:" + o2.getX1());
        System.out.println("Si totusi x1 este:" + o1.getX1());

        Clasa1.printeazaCeva();



//        o1.setX1(3);
//        System.out.println("modificam cu o1:" + Clasa1.x1);
//        o2.setX1(6);
//        System.out.println("modificam cu o2:" + Clasa1.x1);
//
//        System.out.println("-----------------------------");
//        System.out.println("in O1 avem valoarea:" + o1.getX1() + " ,iar in O2 avem valoarea:" + o2.getX1());


    }


}
