package org.oca.PracticeTests._01Test_JavaDataTypes;

import java.util.Comparator;

public class _10ComparatorVariable {

    public static void main(String[] args) {
        Comparator<String> c1 = (j,k) -> 0 ;
        Comparator<String> c2 = (String j,String k) -> 0 ;
        Comparator<String> c3 = (j,k) -> 0 ;
        Comparator<String> c4 = (j,k) -> 0 ;
        Comparator<String> c5 = (j,k) -> {return 0;};
    }

}
