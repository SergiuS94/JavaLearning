package org.oca.Chapter5._03Polymorphism._04HidingStaticMethods._02NegativeScenario;

public class Panda extends Bear {

//    public void sneeze(){     //Doesn't compile because in the parent class it is defined as static
//        System.out.println("Panda bear sneezes");
//    }

//    public static void hibernate(){       //Doesn't compile because in the parent class it is not defined as static
//        System.out.println("Panda bear is going to sleep");
//    }

    /** A method that has to bee overridden can't be hidden and
     *  A method that has to be hidden can't be overridden*/

}
