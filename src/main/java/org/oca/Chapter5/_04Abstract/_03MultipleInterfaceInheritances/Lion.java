package org.oca.Chapter5._04Abstract._03MultipleInterfaceInheritances;

public class Lion extends BigCat{

    /** in this case, Lion has to implement the abstract methods from BigCat and Animal too*/

    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public void roar() {
        System.out.println("Roar");
    }
}
