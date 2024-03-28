package org.oca.Chapter3;

public class C3_2_Strings_Immutable {
    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
        //the result will be 12, not 123, because calling s2.concat("3") will not save the result in the variable
    }
}
