package org.oca.Chapter4._02StaticMethods._05StaticInitialization;

public class _02Exercise_InitializationUsingStaticInit {
    private static int one;
    private static int one_2;  //Does compile, the variable is static but not final. It doesn't need to be initialized or not empty
    private static final int two;   //Does compile because you can initialize it exactly once in a static block, line 12
    private static final int three = 3;
//    private static final int four;  //Does not compile, you can't keep a final variable that is not initialized

    static{
        one = 1;
        two = 2;
//        three = 3;    //Does not compile, you can't reassign an initialized final value(row7)
//        two =4;       //Does not compile, you can't reassign an initialized final value(row 12)
    }


}
