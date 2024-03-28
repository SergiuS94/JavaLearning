package org.oca.Chapter5._03Polymorphism._03RedeclaringPrivateMethods;

/** The child class doesn't have access to the parent getAverageWeight() method because it is private
 *  In this case, Java allow to declare in the child its own version of the method
 *  It is not considered overriding or overloading because it is a separate and independent method
 *
 *  In this case, we have a different return type for the same signature(in case of overriding it wouldn't be allowed, but since we have no access to the method
 *  from the parent class, we are declaring it in our child class as an independent method)
 * */

public class Wolf extends Canine {
    public int getAverageWeight(){
        return 30;
    }

    public static void main(String[] args) {
        System.out.println(new Wolf().getAverageWeight());
    }

}
