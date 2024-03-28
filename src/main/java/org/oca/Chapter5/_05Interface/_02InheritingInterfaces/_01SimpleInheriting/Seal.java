package org.oca.Chapter5._05Interface._02InheritingInterfaces._01SimpleInheriting;

public class Seal implements HasTail,HasWhiskers{


    @Override
    public int getTailLength() {
        return 0;
    }

    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}
