package org.oca.Chapter6._01TryCatch;

public class Example {
    public static void main(String[] args) {
        explore();
    }

    /** The code in the try block is run normally. If any of the statements throw an exception that can be caught by the exception type listed in the catch block,
     *  the try block stops running and execution goes to the catch statement.
     *  If none of the statements in the try block throw an exception that can be caught, the catch cause is not run.*/
    static void explore(){
        try{
            fall();
            System.out.println("fall");
        }catch (RuntimeException e){
            System.out.println("Get up");
        }
    }
    static void fall(){throw new RuntimeException();}

}
