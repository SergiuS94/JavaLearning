package org.oca.Chapter5._03Polymorphism._05OverridingVsHiding._01Example1;

public class Marsupial {

    public static boolean isBiped(){
        return false;
    }

    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on two legs:" + isBiped());
    }


}
