package org.oca.Chapter4;

public class C4_04_Varargs {
    /**
     * Vararg = variable argument
     * A vararg parameter MUST be the last element in a method's parameter list
     * You are only allowed to have one vararg per method
     */

    public void walk1(int... nums) {
    } //works, only 1 and is the last parameter

    public void walk2(int start, int... nums) {
    }//works: 2 parameters, only 1 vararg and is the last element
//  public void walk3(int... nums, int start){}//doesnt work, is not the last element
//  public void walk4(int... nums1,int... nums2){}//doesnt work, has 2 varargs


    /**
     * Calling a method with varargs
     */
    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        walk(1); //prints 0
        walk(1, 2);//prints 1
        walk(1, 2, 3);//prints 2
        walk(1, new int[]{4, 5});//prints 2

    }

    /**
     * Calling a vararg index
     */
    public static void run(int... nums) {
        System.out.println(nums[1]);
    }

    public static void main2(String[] args) {
        run(11,22);//will print 22
    }

}




