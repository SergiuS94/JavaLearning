package org.oca.Chapter5.Quiz.Question3;

public class Frog implements CanHop{
    public static void main(String[] args) {
       Frog frog = new TurtleFrog();
       CanHop muila = new TurtleFrog();
//        ParallelInheritance frog2 = new TurtleFrog();  //nu poti crea obiect doar pentru ca au mostenit acelasi parent
    }

    @Override
    public boolean canHop() {
        return false;
    }
}
