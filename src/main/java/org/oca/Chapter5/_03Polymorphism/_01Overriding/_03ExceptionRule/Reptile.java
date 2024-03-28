package org.oca.Chapter5._03Polymorphism._01Overriding._03ExceptionRule;

import javax.naming.InsufficientResourcesException;

public class Reptile {

    protected boolean hasLegs() throws InsufficientResourcesException{
        throw new InsufficientResourcesException();
    }

    protected double getWeight() throws Exception{
        return 2;
    }


}
