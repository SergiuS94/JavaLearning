package org.oca.Chapter5._03Polymorphism._01Overriding._04ExceptionRuleNegativeScenario;

public class Snake extends Reptile {

    /** In this scenario, both parent and child define two methods.
     *  The first method, getHeight in the parent throws InsufficientResourcesException and in the child it throws Exception
     *  It doesn't compile because Exception is not a subclass of InsufficientResourcesException, so the third rule is violated
     *
     *  The second method in the parent class it doesn't throw any exception but in the child class it does.
     *  The child class defines a new exception that is not allowed(3rd rule)
     *  */


//    protected double getHeight() throws Exception     //Don't compile
//    {
//        return 2;
//    }


//    protected double getLength() throws InsufficientResourcesException {  //doesn't compile
//        return 10;
//    }
}
