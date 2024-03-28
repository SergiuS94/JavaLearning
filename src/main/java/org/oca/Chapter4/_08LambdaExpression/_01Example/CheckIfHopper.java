package org.oca.Chapter4._08LambdaExpression._01Example;

public class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }

}
