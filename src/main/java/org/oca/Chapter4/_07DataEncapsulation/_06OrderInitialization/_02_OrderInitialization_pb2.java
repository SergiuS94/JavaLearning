package org.oca.Chapter4._07DataEncapsulation._06OrderInitialization;

public class _02_OrderInitialization_pb2 {

    private String name = "Blana";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    {
        COUNT++;
        System.out.println(COUNT);
    }
    public _02_OrderInitialization_pb2(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read the construct");
        new _02_OrderInitialization_pb2();
    }

    /** The result is:
     *  1.0
     *  2.read the construct (main e static!)
     *  3.Blana
     *  4.1
     *  5.constructor
     *  */

}
