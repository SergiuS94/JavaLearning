package org.oca.PracticeTests._01Test_JavaDataTypes;

public class _21StringInsertAfterLastIndex {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("radical");
        sb.insert(sb.length(), "robots");
        System.out.println(sb);
    }

}
