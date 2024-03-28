package org.oca.Chapter6._05CallingMethodsThatThrowExceptions._01NegativeExample._01Example1;
class NoMoreCarrotsException extends Exception{};
public class Bunny {

    public static void main(String[] args) {
//        eatCarrot();//Doesn't compile because eatCarrot throws an  exception but main doesn't
    }
    private static void eatCarrot() throws NoMoreCarrotsException{}
}
