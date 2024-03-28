package org.oca.PracticeTests._01Test_JavaDataTypes;

import java.util.Arrays;

public class _29ArrayReplaceAll {
    public static void main(String[] args) {

        var babies = Arrays.asList("chick", "cygnet", "duckling");
        babies.replaceAll(x -> { var newValue = "baby";
            return newValue; });
        System.out.println(babies);

    }
}
