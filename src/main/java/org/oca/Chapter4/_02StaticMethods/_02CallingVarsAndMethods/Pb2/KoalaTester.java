package org.oca.Chapter4._02StaticMethods._02CallingVarsAndMethods.Pb2;

public class KoalaTester {

    public static void main(String[] args) {
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        System.out.println(Koala.count); //wil print 6
        koala2.count = 7;
        System.out.println(Koala.count); //will print 7, even if it was modified by another object, they both modified the same variable(because its static)

    }

}
