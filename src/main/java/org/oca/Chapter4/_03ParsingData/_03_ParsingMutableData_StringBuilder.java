package org.oca.Chapter4._03ParsingData;

public class _03_ParsingMutableData_StringBuilder {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Blana");
        newName(name);
        System.out.println(name); //Unlike the previous example, the StringBuilder is not immutable, so we are passing its reference. That means that the variable from our method
                                    //will point to the same location, and any modification from both places will affect the result.
    }

    public static void newName(StringBuilder name){
        name.append("Urs");
    }

}
