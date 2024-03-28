package org.oca.Chapter4._02StaticMethods._06StaticImports;

/** When we import an external static method, but we already have a method with the same name, our method will be used in this context
 * Try to comment the method from this class, you'll see that the import from above will be used
 * Also, you can't import 2 static methods or variables with the same name
 * */

public class _02_ImportWhenMethodExists {

    public static void main(String[] args) {
        asList("a");
    }

    public static void asList(String x){
        System.out.println("This method will be used");
    }


}
