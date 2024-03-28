package org.oca.Chapter5._05Interface._02InheritingInterfaces._03MultipleInheritingSameMethods;

public class Bear implements Herbivore,Omnivore{

/** eatPlants is included in both Herbivore and Omnivore interfaces
 *  They can both be covered by the same method in this class since they have the same signature
 *  In this case, the interface methods are considered duplicates since they have the same signature*/
    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat");
    }
}
