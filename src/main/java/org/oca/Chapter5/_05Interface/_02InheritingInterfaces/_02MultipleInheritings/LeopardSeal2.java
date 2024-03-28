package org.oca.Chapter5._05Interface._02InheritingInterfaces._02MultipleInheritings;

public class LeopardSeal2 implements HasWhiskers,HasTail {


    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}
