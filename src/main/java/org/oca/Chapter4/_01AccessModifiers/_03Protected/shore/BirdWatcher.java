package org.oca.Chapter4._01AccessModifiers._03Protected.shore;

public class BirdWatcher {

    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }


}
