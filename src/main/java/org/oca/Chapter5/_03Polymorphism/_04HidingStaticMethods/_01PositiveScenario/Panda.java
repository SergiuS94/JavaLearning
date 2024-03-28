package org.oca.Chapter5._03Polymorphism._04HidingStaticMethods._01PositiveScenario;

public class Panda extends Bear{

    /** The eat method in the child class hides the one from the parent class
     *  Because they are both marked as static, this is not considered an overridden method!*/

    public static void eat(){
        System.out.println("Panda bear is eating");
    }

    public static void main(String[] args) {
        Panda.eat();
    }

}
