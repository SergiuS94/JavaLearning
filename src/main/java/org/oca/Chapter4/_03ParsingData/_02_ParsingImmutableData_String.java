package org.oca.Chapter4._03ParsingData;

public class _02_ParsingImmutableData_String {

    public static void main(String[] args) {
        String name = "Andrei";
        newName(name);
        System.out.println(name);//it will print Andrei, again the original variable is not modified
        //the value of the original String can be changed if the return of our method would be the new value, and we store it in our variable, like name = newName(name);
    }

    public static void newName(String name) {
        name = "Blana";
    }

}
