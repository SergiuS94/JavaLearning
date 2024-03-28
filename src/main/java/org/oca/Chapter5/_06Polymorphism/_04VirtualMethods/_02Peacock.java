package org.oca.Chapter5._06Polymorphism._04VirtualMethods;

public class _02Peacock extends _01Bird{
    public String getName(){
        return "Peacock";
    }

    public static void main(String[] args) {
        _01Bird bird = new _02Peacock();
        bird.displayInformation();
    }
    /** in _01Bird, getName returns Unknown
     *  This object is an instance of _02Peacock where getName is overridden
     *  So the method from _01Bird will use the overridden method getName() and will display: The bird name is: Peacock
     *
     *  The parent class bird defines its own version of getName and doesn't know anything about the Peacock class during compile-time.
     *  At runtime, the instance uses the overridden version of the method as defined on the instance of the object*/


}
