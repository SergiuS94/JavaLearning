package org.oca.Chapter5._01Inheritance._04CallingInheritedClassMembers;

public class Fish {
    protected int size;
    private int age;

    public Fish(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

}
