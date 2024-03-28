package org.oca.Chapter5._02Super.SuperAsConstructorOrReference;

public class Child extends Parent{

    public String name;

    public Child(String name, int size){
        super(size);        //super() is used to call the parent constructor, it has to be on the first line!
        super.size  = 3;    //super is used to reference a member from the parent class, it doesn't matter where is called
    }

    public Child(){
        super(3);
    }

}
