package org.oca.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class C3_7e_Arrays_Contains_Equals {

    public static void main(String[] args) {

        List<String> birds = new ArrayList<>();
        System.out.println("Adding hawk to the list");
        birds.add("hawk");
        System.out.println(birds);
        System.out.println("the list contains hawk?:" + birds.contains("hawk"));
        System.out.println("the list contains robin?:" + birds.contains("robin"));

        /**Equals*/
        System.out.println("Creating two new empty lists");
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();

        System.out.println("Are one and two equal?:" + one.equals(two));//true
        System.out.println("one == two?:" + (one==two));//false

        System.out.println("adding 'a' to list one");
        one.add("a");
        System.out.println("Are one and two equal?:" + one.equals(two));//false

        System.out.println("adding 'a' to list two");
        two.add("a");
        System.out.println("Are one and two equal?:" + one.equals(two));//true

        one.add("b");
        two.add(0,"b");
        System.out.println("one:" +one);
        System.out.println("two:" +two);
        System.out.println("Are one and two equal?:" + one.equals(two));//false

    }

}
