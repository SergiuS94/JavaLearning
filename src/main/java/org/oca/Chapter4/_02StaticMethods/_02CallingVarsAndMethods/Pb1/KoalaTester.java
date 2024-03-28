package org.oca.Chapter4._02StaticMethods._02CallingVarsAndMethods.Pb1;

public class KoalaTester {

    public static void main(String[] args) {
        Koala k = new Koala();
        System.out.println(k.count);    //will print 0
        k = null;
        System.out.println(k.count);    //will print 0, k.count is still the same location
    }

}
