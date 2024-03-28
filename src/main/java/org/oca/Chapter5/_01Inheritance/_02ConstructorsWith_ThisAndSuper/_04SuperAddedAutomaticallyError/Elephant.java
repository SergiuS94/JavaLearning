package org.oca.Chapter5._01Inheritance._02ConstructorsWith_ThisAndSuper._04SuperAddedAutomaticallyError;

public class Elephant extends Mammal{
    /** If we are commenting our constructor from this class, the code won't compile
     *  because if we don't have a constructor, Java will automatically add one
     *  if in our constructor we don't call super, java will automatically add super()
     *  but in our case, in the extended class, the only existing constructor takes one parameter
     *  by calling super() it won't compile because it requires an int parameter
     *  So in this case, we have to define our constructor and make the correct call for the parent's constructor*/
    public Elephant(){
        super(3);
    }
}
