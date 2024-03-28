package org.oca.Chapter4.Quiz;

public class Question24 {

    final String value1 = "1";
    static String value2 = "2";
    String value3 = "3";

    {
        value3 = "f";
        value2 = "5";
    }

    static{
        value2 = "4";
    }

    public void doNothing(){
        value3 = "3";
        value2 = "casd";
        asd();
    }

    public static void asd(){

    }


    public static void main(String[] args) {
        asd();
        Question24 a = new Question24();
    }

}
