package org.oca.Chapter4._01AccessModifiers._02Default.duck;

public class GoodDuckling {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        duck.quack();                           //default access, can be called form another class from the same package
        System.out.println(duck.noise);         //default access, can be called form another class from the same package
    }



}
