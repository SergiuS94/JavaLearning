package org.oca.Chapter4;

public class C4_01_MethodDesign {

    /**
     * The method signature is:
     *          Access Modifier     optional specifier    return type    method name   (  list o parameters )   exception(optional)
     * ex:      public              final                 void           test          (int var1) throws InterruptedException{}
     *
     */

    /**
     * Access Modifier    ->not required
     * Optional specifier ->not required
     * return type        ->REQUIRED
     * Method name        ->REQUIRED
     * Param list         ->REQUIRED, but can be empty parantheses
     * optional exception ->not required
     * Method Body        ->REQUIRED, but can be empty braces {}
     */

    public static void main(String[] args) {
        System.out.println("Only info");
    }
}
