package org.oca.Chapter4._01AccessModifiers._01Private.duck;

public class BadDuckling {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
//        duck.quack();                     //DOES NOT COMPILE
//        System.out.println(duck.noise);   //DOES NOT COMPILE
    }


}
