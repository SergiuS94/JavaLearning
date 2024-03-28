package org.oca.Chapter4;

public class C4_02_AccessModifiers {

    //Java offers 4 choices of access modifier:
    //public    ->This method can be called from any class
    //private   ->The method can only be called from within the same class
    //protected ->The method can only be called from classes in the same package or sublcasses
    //default   ->The method can only be called from classes in the same package. No keyword is used = default

    public static void main(String[] args) {
        System.out.println("Only info");
    }
}
