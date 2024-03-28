package org.oca.Chapter5._03Polymorphism._01Overriding._04ExceptionRuleNegativeScenario;

import javax.naming.InsufficientResourcesException;

public class Reptile {

    protected double getHeight() throws InsufficientResourcesException {
        return 2;
    }

    protected double getLength() {
        return 10;
    }


}
