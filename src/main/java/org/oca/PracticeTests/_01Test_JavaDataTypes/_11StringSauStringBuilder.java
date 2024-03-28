package org.oca.PracticeTests._01Test_JavaDataTypes;

public class _11StringSauStringBuilder {
    public static void secret(StringBuilder mystery) {
        char ch = mystery.charAt(3);
        mystery = mystery.insert(1, "more");
        int num = mystery.length();
    }
}
