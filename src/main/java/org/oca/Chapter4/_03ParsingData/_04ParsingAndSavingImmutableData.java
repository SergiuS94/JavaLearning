package org.oca.Chapter4._03ParsingData;

/**A way to use the result from our methods is to return it and store inside a variable */

public class _04ParsingAndSavingImmutableData {

    public static void main(String[] args) {
        String ourText1 = "Blana";
        addLengthToString(ourText1);
        System.out.println(ourText1);//will print the same result (Blana) because we didn't store the returned value in our variable
        ourText1 = addLengthToString(ourText1);
        System.out.println(ourText1);//will return Blana5
    }

    public static String addLengthToString(String ourText){
        return (ourText + ourText.length());
    }


}
