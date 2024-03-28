package org.oca.Chapter5._01Inheritance._01ExtendingExample;

public class Lion extends Animal{

    public void roar() {
        System.out.println("The " + getAge() + " year old.");
//        System.out.println("The age is" + age); //doesn't work, private doesn't allow the extending class to use variables, nighter their objects
        Lion l = new Lion();
//        l.age =  0;//doesn't work, it is private
    }



}
