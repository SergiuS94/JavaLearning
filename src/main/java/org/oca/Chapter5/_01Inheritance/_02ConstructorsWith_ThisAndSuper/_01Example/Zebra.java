package org.oca.Chapter5._01Inheritance._02ConstructorsWith_ThisAndSuper._01Example;

public class Zebra extends Animal{
    public Zebra(int age){
        super(age); //calling the Constructor from Animal
    }
    public Zebra(){
        this(4); //calling another constructor from this class with 1 param(the one from above)
    }
}
