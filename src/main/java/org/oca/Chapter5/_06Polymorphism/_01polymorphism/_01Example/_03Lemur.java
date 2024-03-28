package org.oca.Chapter5._06Polymorphism._01polymorphism._01Example;

public class _03Lemur extends _01Primate implements _02HasTail{
    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        _03Lemur lemur = new _03Lemur();
        _01Primate lemur1 = new _03Lemur();//de test
        _02HasTail lemur2 = new _03Lemur();//de test
//        _04TestExtra lemur3 = new _03Lemur();//de test
        System.out.println(lemur.age);

        _02HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        _01Primate primate = lemur;
        System.out.println(primate.hasHair());



    }


}
