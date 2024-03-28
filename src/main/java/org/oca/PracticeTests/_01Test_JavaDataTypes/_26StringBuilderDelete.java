package org.oca.PracticeTests._01Test_JavaDataTypes;

public class _26StringBuilderDelete {

    public static void main(String[] args) {
        var sb = new StringBuilder();
        sb.append("red");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(1, 4);
        System.out.println(sb);
    }

}
