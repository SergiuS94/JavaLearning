package org.oca.Chapter4._04Overloading;

public class _02_OverloadingUsingVarargs {

    public static void main(String[] args) {
        //Calling the method v1
        _02_OverloadingUsingVarargs object = new _02_OverloadingUsingVarargs();
        object.fly(new int[] {1,2,3});
        //Calling the method v2, is the same but in a variable
        int[] test = new int[] {1,2,3};
        object.fly(test);
        //calling the method v3 (!WORKS)
//        object.fly(1,2,3);//we need to comment the first fly(int[]) and uncomment int... method

        //calling another method, with strings
        object.fly("1","2","3");
    }

    public void fly(int[] lengths) {
        System.out.println();
        for (int length : lengths
        ) {
            System.out.print(length + " ");
        }
    }



//    public void fly(int... lengths){} //Doesn't Compile because Java treats varargs as if they were an array
    //This means that the method signature is the same
    public void fly(String... lengths){
        System.out.println("\nString method");
        for (String length:lengths
             ) {
            System.out.print(length + " ");
        }
    }

}
