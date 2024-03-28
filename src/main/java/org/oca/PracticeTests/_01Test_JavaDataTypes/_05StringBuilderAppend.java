package org.oca.PracticeTests._01Test_JavaDataTypes;

public class _05StringBuilderAppend {
    public static void main(String[] args) {
        StringBuilder line = new StringBuilder("-");
        StringBuilder anotherLine = line.append("-");
        System.out.println((line == anotherLine) + " " + line.length());
    }

}
