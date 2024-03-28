package org.oca.Chapter5._03Polymorphism._01Overriding._03ExceptionRule;

import javax.naming.InsufficientResourcesException;

public class Snake extends Reptile {

    /** In this scenario, both parent and child define two methods.
     *  The first method, hasLegs() in the parent throws an exception but in the child it doesn't
     *  This is not a problem because it doesn't violate our rule. The child method may hide or eliminate a parent method's exception without issue
     *  It can't a new exception, that is the rule!
     *
     *  The second method the parent throws Exception and the child throws InsufficientResourcesException
     *  This is also allowed since InsufficientResourcesException is a subclass of Exception by construction*/


    @Override
    protected boolean hasLegs(){
        return hasLegs();
    }

    @Override
    protected double getWeight() throws InsufficientResourcesException {
        return 2;
    }
}
