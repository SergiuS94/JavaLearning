package org.oca.Chapter4._04Overloading;

public class _05_OverloadingWithPrimitives {

    /** In this case of overloading, the compiler will match the most specific method
     * in order to call the short or long we need to specify that when we send the reference
     * !!!BUT IF WE REMOVE THE INT METHOD, our code will try to automatically match another one from the remaining ones (all long, except the last call which will remain short)
     * !!!BUT IF WE COMMENT THE SHORT METHOD TOO, Even if in our call we use (short)20 it will match the reference to the long method
     * */

    public static void main(String[] args) {
        _05_OverloadingWithPrimitives object = new _05_OverloadingWithPrimitives();
        object.fly(10);  //will print integer
        object.fly(10L); //will print long
        object.fly(2147483647); //will print integer
//        object.fly(2147483648);//doesn't compile, is the Int_max_value + 1, out of range, and it is not recognized as long if we don't specify that
        object.fly(2147483648L); //will print long
        object.fly((short)20); //will print short
    }

    public void fly(int i){
        System.out.println("integer ");
    }

    public void fly(short i){
        System.out.println("short ");
    }

    public void fly(long i){
        System.out.println("long ");
    }

}
