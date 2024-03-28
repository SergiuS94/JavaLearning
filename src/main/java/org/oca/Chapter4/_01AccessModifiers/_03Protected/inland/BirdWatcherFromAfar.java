package org.oca.Chapter4._01AccessModifiers._03Protected.inland;


import org.oca.Chapter4._01AccessModifiers._03Protected.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird(){
        Bird bird = new Bird();
//        bird.floatInWater();                 //DOES NOT COMPILE
//        System.out.println(bird.text);       //DOES NOT COMPILE
    }
    /**When we try to call the methods and fields from package inland/BirdWatcherFromAfar,
     * it doesn't compile because the fields are protected and not visible outside
     * of the package if the class is not extended.
     * */

}
