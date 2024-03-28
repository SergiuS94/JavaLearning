package org.oca.Chapter5._01Inheritance._02ConstructorsWith_ThisAndSuper._01Example;

public class Animal {
    private int age;
    public Animal(int age){
        super(); //calls the constructor from the extended class. Since we are not directly extending anything, it will call the constructor from
        //java.lang.Object which takes no argument
        this.age=age;
    }
}
