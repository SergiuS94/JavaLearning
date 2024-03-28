package org.oca.Chapter5._04Abstract._06StaticInterfaceMethods._01Example1;

public class Bunny implements Hop{

    public void printDetails(){
//        System.out.println(getJumpHeight());//Doesn't compile, you can access it only trough Hop or by static importing the method
        System.out.println(Hop.getJumpHeight());
//        System.out.println(Bunny.getJumpHeight());//Doesn't compile, the method is not inherited!!!
    }

}
