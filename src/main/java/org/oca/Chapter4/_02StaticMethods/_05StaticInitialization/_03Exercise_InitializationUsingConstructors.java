package org.oca.Chapter4._02StaticMethods._05StaticInitialization;

public class _03Exercise_InitializationUsingConstructors {
    private static int one;
    private static int one_2;  //Does compile, the variable is static but not final. It doesn't need to be initialized or not empty
//    private static final int two;   //does not compile, the constructor is not being called before this assignment.
    private static final int three = 3;
//    private static final int four;  //Does not compile, you can't keep a final variable that is not initialized. So you can't initialize a final variable in the constructor

    _03Exercise_InitializationUsingConstructors(){
        one = 1;
//        two = 2;
//        three = 3;    //Does not compile, you can't reassign an initialized final value(row7)
    }
}
