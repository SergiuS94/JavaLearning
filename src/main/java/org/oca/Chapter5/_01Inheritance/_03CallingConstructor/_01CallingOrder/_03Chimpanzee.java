package org.oca.Chapter5._01Inheritance._03CallingConstructor._01CallingOrder;

/** In this class we are extending _02Ape which  is extending _01Primate
 *  When creating a new object, the parent constructor is executed before the child constructor
 *  By running this class, you'll see that the first executed constructor is _01Primate, then _02Ape and in the end _03Chimpanzee*/

public class _03Chimpanzee extends _02Ape {
    public _03Chimpanzee(){
        System.out.println("Chimpanzee");
    }
    public static void main(String[] args) {
        new _03Chimpanzee();
    }
}
