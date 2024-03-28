package org.oca.Chapter4._07DataEncapsulation;

public class _03_ImmutableClasses {

    /**
     * Encapsulating data is helpful because it prevents callers from making uncontrolled changes to your class
     * Another common technique is making classes immutable, so they cannot be changed at all
     * One step to make a class immutable is to omit the setters, but we want to allow the caller to set the initial value(we'll use the constructor)
     * Immutable is only measured after the object is constructed. Immutable classes are allowed to have values, but they can't be changed
     */

    private int numEggs;

    public _03_ImmutableClasses(int numEggs) {
        this.numEggs = numEggs;
    }

    public int getNumberEggs(){
        return numEggs;
    }


}
