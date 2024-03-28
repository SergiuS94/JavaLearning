package org.oca.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class C3_7b_ArrayList_add_remove {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();//create an arraylist with space for the dewfault nr of elements
        ArrayList list2 = new ArrayList(10);//specific no of elements, but still not filling them
        ArrayList list3 = new ArrayList(list2);//we want to copy the size and the elements of another list


        //Using the ArrayList
        ArrayList list = new ArrayList();
        /**Adding elements*/
        list.add("Victor");//Victor
        list.add(Boolean.TRUE);//Victor,true
        System.out.println(list);

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Victor");//Victor
//        list4.add(Boolean.TRUE);//not working, this time we can add only String objects


        List<String> birds = new ArrayList<>();
        birds.add("hawk");//hawk
        birds.add(1,"robin");//hawk,robin
        birds.add(0,"blue");//blue,hawk,robin
        birds.add(1,"cardinal");//blue,cardinal,hawk,robin
        System.out.println(birds);

        /**Removing Elements*/
        System.out.println("After removing hawk:");
        birds.remove("hawk");//returns true and removes one element from the list
        System.out.println(birds);//blue,cardinal,robin

        System.out.println("After removing hawk 2nd time:");
        birds.remove("hawk");//returns false but doesn't affect the list
        System.out.println(birds);//Same result because hawk doens't exist   //blue,cardinal,robin

        System.out.println("After removing element 0");
        System.out.println(birds.remove(0));//prints blue(the deleted element)
        System.out.println(birds);//cardinal,robin


//        System.out.println("After removing element 2(of max 1)");
//        System.out.println(birds.remove(2));// Index 2 out of bounds for length 2
//        System.out.println(birds);//cardinal,robin




    }
}
