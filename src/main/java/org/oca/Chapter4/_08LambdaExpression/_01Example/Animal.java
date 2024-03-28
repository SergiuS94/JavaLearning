package org.oca.Chapter4._08LambdaExpression._01Example;

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean hooper, boolean swimmer){
        this.species = species;
        this.canHop = hooper;
        this.canSwim = swimmer;
    }

    public boolean canHop() { return canHop;}
    public boolean canSwim() {return canSwim;}
    public String toString() {return species;}


}
