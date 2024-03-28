package org.oca.Chapter5._01Inheritance._02ConstructorsWith_ThisAndSuper._02WrongExampleSuper;

public class Animal {
    private int age;
    public Animal(int age){

/**        System.out.println("something");//!!!!Doesn't compile. super has to be the first statement of a constructor */
        super(); //calls the constructor from the extended class. Since we are not directly extending anything, it will call the constructor from
        //java.lang.Object which takes no argument
        this.age=age;
    }
}
