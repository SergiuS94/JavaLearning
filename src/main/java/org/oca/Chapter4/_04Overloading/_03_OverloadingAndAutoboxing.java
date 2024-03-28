package org.oca.Chapter4._04Overloading;

public class _03_OverloadingAndAutoboxing {

    /** In this case Java will use the most specific method (int). In order to use Integer it would need a cast to Integer
     * but because a more specific method is found, where the cast is not necessary, it uses that.
     * It could call the Integer method, just comment the first one and the other will be called
     * */

    public static void main(String[] args) {
         _03_OverloadingAndAutoboxing object = new _03_OverloadingAndAutoboxing();
         object.fly(3);
    }

    public void fly(int numMiles){
        System.out.println("the int metod is used");
    }

    public void fly(Integer numMiles){
        System.out.println("the Integer metod is used");
    }

}
