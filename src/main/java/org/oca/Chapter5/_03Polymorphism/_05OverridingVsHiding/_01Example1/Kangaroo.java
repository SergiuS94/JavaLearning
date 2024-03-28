package org.oca.Chapter5._03Polymorphism._05OverridingVsHiding._01Example1;

public class Kangaroo extends Marsupial {

    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs:" + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo blana = new Kangaroo();
        blana.getMarsupialDescription(); //is called from the extended class, where it will use the local isBiped method because it is static and it is hidden only in the child method
                                        //so it will return the string + false
        blana.getKangarooDescription();//the local method is called where isBiped from the parent is hidden so the local method will be used
                                        // it will display the string + true
    }


}
