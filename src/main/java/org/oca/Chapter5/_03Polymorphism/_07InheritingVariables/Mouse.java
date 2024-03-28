package org.oca.Chapter5._03Polymorphism._07InheritingVariables;

public class Mouse extends Rodent{

    protected int tailLength  =8;
    public void getMouseDetails(){
        System.out.println("tail = " + tailLength +",parentTail = " + super.tailLength);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();   //will print parentTail=4
        mouse.getMouseDetails();    //will print tail=8,parentTail=4
    }

}
