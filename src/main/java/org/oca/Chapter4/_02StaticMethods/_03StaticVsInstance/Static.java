package org.oca.Chapter4._02StaticMethods._03StaticVsInstance;

public class Static {
    private String name = "Static class";
    public static void first(){}
    public static void second(){}
    public void third(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        first();
        second();
//        third();        //doesn't compile. A static method can not call an Instance method

        //a solution to solve this call would be to make third static, and also change name variable to static
        //another solution would be to do this call:
        new Static().third();
    }
}
