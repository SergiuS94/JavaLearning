package org.oca.Chapter5._04Abstract._01CreatingAbstractClass;

public abstract class Animal {
    protected int age;
    public void eat(){
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}
