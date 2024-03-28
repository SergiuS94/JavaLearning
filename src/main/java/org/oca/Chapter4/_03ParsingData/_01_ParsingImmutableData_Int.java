package org.oca.Chapter4._03ParsingData;

public class _01_ParsingImmutableData_Int {

    public static void main(String[] args) {
        int num =2;
        newNumber(num);
        System.out.println(num);//it will print 2, not 8. The value that is sent to the method is a copy of the original one
    }

    public static void newNumber(int num){
        num = 8;
    }

}
