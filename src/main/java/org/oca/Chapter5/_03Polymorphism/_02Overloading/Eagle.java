package org.oca.Chapter5._03Polymorphism._02Overloading;

public class Eagle extends  Bird{

    public int fly(int height){
        System.out.println("Bird is flying " + height + " meters");
        return height;
    }

//    public int eat(int food){
//        System.out.println("Bird is eating " + food + "units of food");
//        return food;
//    }

    /** The first method, fly() is overloaded in the subclass since the signature changes from a no-argument to a constructor with one int argument.
     *  The second method, eat(), is overridden in the subclass Eagle since the signature is the same, a single int argument.
     *  !Because the method is overridden the return type must be the same or a subclass of its return type
     *  So, same signature means Overriding(same return type, same no. of params, same exceptions thrown)
     *      different signature means overloading.
     * */

}
