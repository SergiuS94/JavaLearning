package org.oca.PracticeTests._01Test_JavaDataTypes;

public class _18StaticVarCall {

    static int start = 2;
    final int end;

    public _18StaticVarCall(int x){
        x = 4;
        end = x;
    }
    public void fly(int distance){
        System.out.println(end-start+" ");
        System.out.println(distance);
    }

    public static void main(String[] args) {
        new _18StaticVarCall(10).fly(5);
    }

}
