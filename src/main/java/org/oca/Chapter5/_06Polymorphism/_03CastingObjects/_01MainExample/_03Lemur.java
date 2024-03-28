package org.oca.Chapter5._06Polymorphism._03CastingObjects._01MainExample;

public class _03Lemur extends _01Primate implements _02HasTail {
    @Override
    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        _03Lemur lemur = new _03Lemur();
        _01Primate primate = lemur;

        /** By changing the reference type for our lemur object (_01Primate) we lost access to more specific methods defined in the subclass
         *  We can reclaim those references by casting the object back to the specific subclass it came from*/
//         _03Lemur lemur2 = primate;//Doesn't compile without casting.
        _03Lemur lemur3 = (_03Lemur) primate;
        System.out.println(lemur3.age);


    }


}
