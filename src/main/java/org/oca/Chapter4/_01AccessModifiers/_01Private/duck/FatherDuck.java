package org.oca.Chapter4._01AccessModifiers._01Private.duck;

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise);
    }

    private void makeNoise() {
        quack();
    }


}
