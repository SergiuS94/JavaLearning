package org.oca.Chapter6._05CallingMethodsThatThrowExceptions._01NegativeExample._03CatchNotNeeded;
class NoMoreCarrotsException extends Exception{};
public class Bunny {

    public static void main(String[] args)  {
        try {
            eatCarrot();
//        }catch (NoMoreCarrotsException ex){}//This doesn't compile because eatCarrot doesn't use this exception
        }catch (Exception ex){}//but you can still try to catch generic exceptions
    }
    private static void eatCarrot(){}
}
