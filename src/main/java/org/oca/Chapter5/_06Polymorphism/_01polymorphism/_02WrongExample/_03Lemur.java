package org.oca.Chapter5._06Polymorphism._01polymorphism._02WrongExample;

public class _03Lemur extends _01Primate implements _02HasTail {
    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        _03Lemur lemur = new _03Lemur();
        _02HasTail hasTail = lemur;
//        System.out.println(hasTail.age); //Doesn't compile, age is part only of _03Lemur
        _01Primate primate = lemur;
//        System.out.println(primate.isTailStriped()); // Doesn't compile because isTailStriped is not part of _01Primate

    }


}
