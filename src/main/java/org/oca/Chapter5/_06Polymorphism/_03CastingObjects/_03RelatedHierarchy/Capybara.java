package org.oca.Chapter5._06Polymorphism._03CastingObjects._03RelatedHierarchy;

public class Capybara extends Rodent{
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent;//Throws ClassCastException at runtime
        /** This code creates an instance of Rodent and then tries to cast it to a subclass of Rodent, Capybara
         *  Although this code will compile without issue, it will throw a ClassCastException at runtime since the object being referenced is not
         *  an instance of the Capybara class.
         *  The thing to keep in mind in this example is the object that was created is not related to the Capybara class in any way*/
    }
}
