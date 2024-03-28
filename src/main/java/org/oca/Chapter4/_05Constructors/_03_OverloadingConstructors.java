package org.oca.Chapter4._05Constructors;

public class _03_OverloadingConstructors {

    private int weight;
    private String test;

    /**
     * Such as method we can create multiple constructors, the condition remain the same, different no. of params or dif. parameters type
     */

    public static void main(String[] args) {
        _03_OverloadingConstructors object = new _03_OverloadingConstructors();//calls the 1st (empty) constructor
        _03_OverloadingConstructors object2 = new _03_OverloadingConstructors(3);//calls the 2nd (int) constructor
        _03_OverloadingConstructors object3 = new _03_OverloadingConstructors(3, "Blana");//calls the 2rd (int,String) constructor
    }

    public _03_OverloadingConstructors() {
    }

    public _03_OverloadingConstructors(int weight) {
        this.weight = weight;
    }

    public _03_OverloadingConstructors(int weight, String test) {
        this.weight = weight;
        this.test = test;
    }

    public _03_OverloadingConstructors(String s1, String s2) {
//        _03_OverloadingConstructors(7);//will not compile, you can't call a constructor like this. the constructors can be called only by using the keyword new

        this(7, "Blana"); //You can call a constructor like this, but using the keyword this MUST BE THE FIRST non commented line of the method
        new _03_OverloadingConstructors(7);//This will work too
    }

}
