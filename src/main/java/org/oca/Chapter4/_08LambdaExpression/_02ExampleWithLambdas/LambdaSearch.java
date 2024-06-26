package org.oca.Chapter4._08LambdaExpression._02ExampleWithLambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle",false,true));

        System.out.println("Can swim:");
        print(animals, a-> a.canSwim());

        System.out.println("Can hop:");
        print(animals, a-> a.canHop());

    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal : animals){
            if(checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }


}
