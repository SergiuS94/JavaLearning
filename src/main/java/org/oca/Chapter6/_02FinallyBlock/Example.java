package org.oca.Chapter6._02FinallyBlock;

public class Example {
    public static void main(String[] args) {
        explore();
    }

    /** There are two paths for finally to be executed:
     *  1.If an exception is thrown, the finally block is run after the catch block
     *  2.If no exception is thrown, the finally block is run after the try block completes*/
    static void explore(){
        try{
            fall();
            System.out.println("fall");
        }catch (RuntimeException e){
            System.out.println("Get up");
        }finally {
            System.out.println("See more animals");
        }
        System.out.println("blana");
    }
    static void fall(){throw new RuntimeException();}

}
