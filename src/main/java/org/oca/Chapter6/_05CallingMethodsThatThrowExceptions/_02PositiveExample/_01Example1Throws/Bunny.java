package org.oca.Chapter6._05CallingMethodsThatThrowExceptions._02PositiveExample._01Example1Throws;
class NoMoreCarrotsException extends Exception{};
public class Bunny {

    public static void main(String[] args) throws Exception{
        eatCarrot();//compiles because main also Throws NoMoreCarrotsException/Exception
    }
    private static void eatCarrot() throws NoMoreCarrotsException{}
}
