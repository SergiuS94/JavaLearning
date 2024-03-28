package org.oca.Chapter5._03Polymorphism._05OverridingVsHiding._02Example2;

public class Kangaroo extends Marsupial {

    public boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs:" + isBiped());
    }

    public static void main(String[] args) {
        Kangaroo blana = new Kangaroo();
        blana.getMarsupialDescription(); //In this scenario we are using a method defined in the parent class but because we are calling it through a child object
                                        //the isBiped() method is overridden
                                        //so it will return the string + true, even if in the Marsupial method isBiped returns false. In the Kangaroo object it is overridden
        blana.getKangarooDescription();//the local method is called where isBiped from the parent is hidden so the local method will be used
                                        // it will display the string + true
    }


}
