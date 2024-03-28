package org.oca.Chapter5._06Polymorphism._03CastingObjects._02UnrelatedTypeExample;

public class _02Fish {
    public static void main(String[] args) {
        _02Fish fish = new _02Fish();
//        _01Bird bird = (_01Bird) fish; //Doesn't compile
        /** The third rule is important. The exam may try to trick me with a cast that the compiler doesn't allow.
         *  In this case, Fish is not a subclass of bird*/
    }
}
