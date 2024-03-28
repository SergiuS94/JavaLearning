package org.oca.Chapter4._07DataEncapsulation._06OrderInitialization;

public class _01_OrderInitialization {

    /** The order of initialization is the following:
     *  1.If there is a superclass, initialize it first(we'll se in chapter 5)
     *  2.Static variable declarations and static initializers in the order they appear in the file
     *  3.Instance variable declarations and instance initializers in the order they appear in the file
     *  4.The constructor
     *
     *  */

    private String name = "Andrei";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static{
        System.out.println(COUNT);
    }
    static {
        COUNT+=10;
        System.out.println(COUNT);
    }
    public _01_OrderInitialization(){
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        _01_OrderInitialization object = new _01_OrderInitialization();
        /** The result will be:
         * 0
         * 10
         * Andrei
         * constructor
         * */
    }


}
