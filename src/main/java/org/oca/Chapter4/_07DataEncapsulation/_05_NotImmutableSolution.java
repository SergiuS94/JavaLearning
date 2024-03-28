package org.oca.Chapter4._07DataEncapsulation;

public class _05_NotImmutableSolution {

    private StringBuilder builder;

    public _05_NotImmutableSolution(StringBuilder b) {
        builder = new StringBuilder(b);
    }

    public StringBuilder getBuilder() {
        return new StringBuilder(builder); //now that we are returning a new reference that contains the same value, we don't need to worry that the user will be able to change our variable
//    return builder.toString(); //This could be another approach to return only the value, not the reference. We need to change the return type too.
    }

}
