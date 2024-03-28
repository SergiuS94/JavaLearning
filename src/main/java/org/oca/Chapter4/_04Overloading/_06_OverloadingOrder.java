package org.oca.Chapter4._04Overloading;

public class _06_OverloadingOrder {

    /** The order that Java will use in case of overloading is the following(for calling glide(1,2)):
     * 1.Exact match by type        public String glide(int i, int j){}
     * 2.Larger primitive type      public String glide(long i, long j){}
     * 3.Autoboxed type             public String glide(Integer i, Integer j){}
     * 4.Varargs                    public String glide(int... nums){}
     *
     * */

    public static void main(String[] args) {
        System.out.println(glide("a")); //will print 1
        System.out.println(glide("a","b")); //will print 4
        System.out.println(glide("a","b","c")); //will print 2
    }

    public static String glide(String s){
        return "1";
    }

    public static String glide(String... s){
        return "2";
    }

    public static String glide(Object o){
        return "3";
    }

    public static String glide(String s, String t){
        return "4";
    }

}
