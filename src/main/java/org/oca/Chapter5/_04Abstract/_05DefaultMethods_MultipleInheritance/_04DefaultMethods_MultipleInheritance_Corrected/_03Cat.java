package org.oca.Chapter5._04Abstract._05DefaultMethods_MultipleInheritance._04DefaultMethods_MultipleInheritance_Corrected;


public class _03Cat implements _01Walk,_02Run { //it compiles if we override the default method that comes from both interfaces
    public int getSpeed(){
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new _03Cat().getSpeed());
    }
}
