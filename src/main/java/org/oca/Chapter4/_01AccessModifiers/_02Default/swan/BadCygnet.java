package org.oca.Chapter4._01AccessModifiers._02Default.swan;
import AndreiP.OCA.Chapter4._01AccessModifiers._02Default.duck.MotherDuck;   //we need to import it



public class BadCygnet {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
//        duck.quack();                         //DOES NOT COMPILE
//        System.out.println(duck.noise);       //DOES NOT COMPILE
    }

    /**We were able to call the default methods and fields in GoodDuckling class, because they were in the same package
     * But the same code here won't work because we're in different package
     * */



}
