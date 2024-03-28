package org.oca.Chapter4._04Overloading;

public class _07_OverloadingWithPrimitivesException {

    public static void main(String[] args) {
        play(4L);//calls the long version
//        play(4);//doesn't compile because Java can convert the int 4 to a long 4 or Integer 4, but in can't handle converting in two steps
                    //first, to a long and then to a Long
                    //if the method would be play(Object o) it would match because only one conversion would be necessary, from int to Integer.(Integer is an object)
    }

    public static void play(Long l){

    }

}
