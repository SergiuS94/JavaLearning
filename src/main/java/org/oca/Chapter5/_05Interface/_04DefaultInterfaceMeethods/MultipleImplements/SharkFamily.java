package org.oca.Chapter5._05Interface._04DefaultInterfaceMeethods.MultipleImplements;

public interface SharkFamily extends HasFins{

    //Replaces getNumberOfFins with a new method that return a different value
    public default int getNumberOfFins(){
        return 8;
    }

    //Replaces getLongestFinLength with its body, and forces any class that implements SharkFamily to provide an implementation of it
    public double getLongestFinLength();

    //But trying to override the method, without using the default keyword will result into a compiler error:
//     public boolean doFinsHaveScales(){ //missing default, you can make it as above without body, or using default you can define the body
//        return false;
//    }

}
