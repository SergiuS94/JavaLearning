package org.oca.Chapter5._03Polymorphism._01Overriding._01PositiveScenario;

/** In this scenario we are using super to point at the parent method. without using super, the current method would be called again and in this case it would transform it
 *  into an infinite loop
 *  Rewriting a method means that the current class will take the most specific method, unless we specify that we want the parent method to be used*/

public class Wolf extends Canine{
    public double getAverageWeight(){
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }

}
