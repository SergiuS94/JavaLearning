package org.oca.Chapter5._01Inheritance._02ConstructorsWith_ThisAndSuper._02WrongExampleSuper;

public class Zebra extends Animal {
    public Zebra(int age) {
/**          System.out.println("something");//!!!!Doesn't compile. super has to be the first statement of a constructor */
        super(age); //calling the Constructor from Animal
    }

    public Zebra() {
 /**          System.out.println("something");//!!!!Doesn't compile. super has to be the first statement of a constructor */
        this(4); //calling another constructor from this class with 1 param(the one from above)
    }
}
