package org.oca.Chapter4._01AccessModifiers._03Protected.goose;

public class GooseWatcher {
    public void watch(){
        Goose goose = new Goose();
//        goose.floatInWatter();    //DOES NOT COMPILE
    }
}


/** In this example the code will not compile because we are not in the Goose class
 * floatInWatter is declared in Bird as protected
 * GooseWatcher is not in the same package as Bird, nor extend Bird.
 * Goose extends Bird. That only let Goose to refer to floatInWater() and not callers of Goose
 * */
