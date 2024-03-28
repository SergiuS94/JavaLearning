package org.oca.PracticeTests._02Test_ControllingProgramFlow;

public class _09LoopSiBreak {

    public static void main(String[] args) {
        String race="";
        loop:// Labels are used to specify a particular loop or block of code that can be targeted with the break or continue statements.
        do{
            race +="x";
            break loop;
        }while (true);
        System.out.println(race);
        loop2:
        {

        }
        loop3:
        System.out.println("asd");
        int a;
        loop4:
        a = 0;
    }



}
