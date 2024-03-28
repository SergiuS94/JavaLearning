package org.oca.Chapter5._05Interface._02InheritingInterfaces._04MultipleInheritingMethodsOverloading._03MultipleInheritingSameMethods;

public class Bear implements Herbivore, Omnivore {

    /**
     * eatPlants is included in both Herbivore and Omnivore interfaces but with different signatures.
     * We have to implement them both, because they're considered as different methods (overloading)
     */
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat");
    }

    @Override
    public void eatPlants(int quantity) {
        System.out.println("Eating plants " + quantity);
    }
}
