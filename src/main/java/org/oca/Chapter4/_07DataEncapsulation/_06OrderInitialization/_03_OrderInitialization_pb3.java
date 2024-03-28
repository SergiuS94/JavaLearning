package org.oca.Chapter4._07DataEncapsulation._06OrderInitialization;

public class _03_OrderInitialization_pb3 {

    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    _03_OrderInitialization_pb3() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new _03_OrderInitialization_pb3();
    }

    {
        add(8);
    }

    public static void main(String[] args) {

    }

    /** Will be printed:
     * 2 4 6 8 5
     * 2 si 4 e clar, vor fi primele afisate. Se ia tot ce e static si se apeleaza in ordine
     * urmatorul static ne creeaza o noua instanta a clasei deci verificam regula 3 si cautam instance variables
     * asadar cand se creeaza instanta prima data se apeleaza variabilele si blocurile de instanta si abia apoi constructorul, afisandu-se 6 8 5
     * */

}
