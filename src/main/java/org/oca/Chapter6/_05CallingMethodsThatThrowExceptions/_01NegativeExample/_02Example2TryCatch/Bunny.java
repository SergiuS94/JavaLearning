package org.oca.Chapter6._05CallingMethodsThatThrowExceptions._01NegativeExample._02Example2TryCatch;
class NoMoreCarrotsException extends Exception{};
public class Bunny {

    public static void main(String[] args) {
        try {
//            eatCarrot();//Doesn't compile because catch doesn't use the same ori equivalent exception
        }catch (NullPointerException ex){}
    }
    private static void eatCarrot() throws NoMoreCarrotsException{}
}
