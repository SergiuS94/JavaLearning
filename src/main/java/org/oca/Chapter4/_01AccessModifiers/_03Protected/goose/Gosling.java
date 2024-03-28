package org.oca.Chapter4._01AccessModifiers._03Protected.goose;


import org.oca.Chapter4._01AccessModifiers._03Protected.shore.Bird;

public class Gosling extends Bird { //extending the clas with protected methods and fields
    public void swim() {
        floatInWater();             //calling a protected method(from an extended class) ->works
        System.out.println(text);   //calling a protected field(from an extended class) ->works
    }


}
