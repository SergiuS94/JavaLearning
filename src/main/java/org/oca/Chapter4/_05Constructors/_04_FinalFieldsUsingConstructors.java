package org.oca.Chapter4._05Constructors;

public class _04_FinalFieldsUsingConstructors {

    /** Final instance variables must be assigned a value exactly once
     * to do that, we can initialize them when they're declared, or in the constructor
     * If they're static they have to be initialized when declared or in the static{} field (described in the previous chapters)
     * */

    private  final int volume;
    private final String name = "Blana";

    public _04_FinalFieldsUsingConstructors(){
        volume = 7;
    }

    public static void main(String[] args) {

    }



}
