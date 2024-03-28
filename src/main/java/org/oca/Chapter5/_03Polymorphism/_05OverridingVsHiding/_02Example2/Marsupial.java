package org.oca.Chapter5._03Polymorphism._05OverridingVsHiding._02Example2;

public class Marsupial {

    public boolean isBiped(){
        return false;
    }

    public void getMarsupialDescription(){
        System.out.println("Marsupial walks on two legs:" + isBiped());
    }



}
