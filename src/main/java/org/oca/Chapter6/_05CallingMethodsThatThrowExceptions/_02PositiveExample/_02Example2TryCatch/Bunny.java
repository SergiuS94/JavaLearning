package org.oca.Chapter6._05CallingMethodsThatThrowExceptions._02PositiveExample._02Example2TryCatch;
class NoMoreCarrotsException extends Exception{};
public class Bunny {

    public static void main(String[] args) {
        try {
            eatCarrot();//compiles because catch also uses NoMoreCarrotsException/Exception
        }catch (Exception ex){}
    }
    private static void eatCarrot() throws NoMoreCarrotsException{}
}
