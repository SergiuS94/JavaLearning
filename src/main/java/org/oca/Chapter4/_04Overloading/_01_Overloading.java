package org.oca.Chapter4._04Overloading;

public class _01_Overloading {

    /** Overloading stands for the property of using the same name for methods but with different number of parameters or param type */

    public static void main(String[] args) {
        _01_Overloading testingMethodsObject = new _01_Overloading();
        testingMethodsObject.fly(10);
        testingMethodsObject.fly((short)20);
        testingMethodsObject.fly();
//        testingMethodsObject.fly(10,40);//doesn't work, because our numbers are considered int - int. We need to cast the first param to short
        testingMethodsObject.fly((short) 10,40);
    }

    public void fly(int numMiles){
        System.out.println("Integer parameter:" + numMiles);
    }

    public void fly(short numFeet){
        System.out.println("Short parameter:" + numFeet);
    }

    public boolean fly(){
        System.out.println("Boolean method");
        return false;
    }

    public void fly(short numFeet, int numMiles) {
        System.out.println("short and int parameters:" + numFeet + " " + numMiles);
    }

}
