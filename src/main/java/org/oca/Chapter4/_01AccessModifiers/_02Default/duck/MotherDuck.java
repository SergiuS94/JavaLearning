package org.oca.Chapter4._01AccessModifiers._02Default.duck;

public class MotherDuck {
    String noise = "quack";
    void quack(){
        System.out.println(noise);
    }

    private void makeNoise(){
        quack();
    }

}
