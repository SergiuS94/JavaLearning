package org.oca.Chapter4._01AccessModifiers._03Protected.swan;

import AndreiP.OCA.Chapter4._01AccessModifiers._03Protected.shore.Bird;

public class Swan extends Bird {

    public void swim(){
        floatInWater();
        System.out.println(text);
    }
    public void helpOtherSwanSwim(){
        Swan other = new Swan();                //works
        other.swim();                           //works
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim(){
        Bird other = new Bird();
//        other.floatInWater();                 //DOES NOT COMPILE
//        System.out.println(other.text);       //DOES NOT COMPILE
    }

    /**We are not in the same package as Bird, but we are extending it
     * it means that the Swan class ond Swan objects are able to use the protected methods and fields from Bird
     * On line 10,11 we are directly calling those methods
     * On line 14,15 we have an object of Swan that calls the methods, and in this class the Swan class or objects are allowed to do that
     * On line 21,22 we have a Bird object. The Bird object has no access in this class to call those methods or fields
     * Because we are not in the same package and there only the class and Swan objects are allowed to use  the protected fields from Bird
     * */


}
