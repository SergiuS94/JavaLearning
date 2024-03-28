package org.oca.Chapter4._04Overloading;

public class _04_OverloadingReferenceTypes {

    /** When a reference used to call a method can point to two methods, it will use the most specific
     * in the first example, "test" can be used by Object and by String too, but String is more specific
     * in the other two cases, the reference type matches only Object, so that's the one that will be used
     * */

    public static void main(String[] args) {
        _04_OverloadingReferenceTypes object = new _04_OverloadingReferenceTypes();
        object.fly("test"); // will print string
        object.fly(false);  // will print object
        object.fly(54);     // will print object
    }

    public void fly(Object o) {
        System.out.println("object");
    }

    public void fly(String s) {
        System.out.println("string");
    }

}
