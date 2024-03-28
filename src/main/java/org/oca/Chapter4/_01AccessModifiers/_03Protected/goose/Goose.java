package org.oca.Chapter4._01AccessModifiers._03Protected.goose;

import AndreiP.OCA.Chapter4._01AccessModifiers._03Protected.shore.Bird;

public class Goose extends Bird {

    public void helpGooseSwin(){
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }
    public void helpOtherGooseSwim(){
        Bird other = new Goose();
//        other.floatInWater();             //DOES NOT COMPILE
//        System.out.println(other.text);   //DOES NOT COMPILE
    }

    /**Now we create a Goose class in the goose package.
     * We are not in the same package as Bird, but we are extending it
     * it means that the Goose class ond Goose objects are able to use the protected methods and fields from Bird
     * On line 9,10 we have an object of Swan that calls the methods, and in this class the Swan class or objects are allowed to do that
     * On line 14,15 we have a Goose object but it is stored in a Bird reference
     * We are not allowed to refer to members of hte Bird class since we are not in the same package and Bird is not a subclass of Bird
     * Because we are not in the same package and there only the class and Swan objects are allowed to use  the protected fields from Bird
     * */

}
