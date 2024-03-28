package org.oca.Chapter3;

public class C3_0_INFO {

    public static void main(String[] args) {
        /** 1.StringBuilder e mutabil, deci daca il trimiti ca parametru spre o metoda, valoarea acestuia va fi schimbata global
         * In schimb String, sau int, sunt imutabile, odata transmise, nu vor fi modificate global ci doar in interiorul metodei
         * */


        /**2.The comparison in the if statement is false because you are comparing String objects using the "==" operator,
         * which compares object references rather than the actual string values.
         * In Java, when you use the "+" operator to concatenate strings, a new String object is created each time.
         */

        /**3.The first dimension is mandatory to be declared when you initialize an array
         * Also, A dimension can have the length = 0 new Int[3][0][] */

        /**4.length e fara paranteze de fiecare data, mai putin la String sau StringBuilder unde defapt acesta e metoda sa
         *  .size e tot timpul metoda si nu va fi niciodata cu ()*/

        /**5.The capacity() method returns the current capacity of the StringBuilder or StringBuffer.
         * Capacity is the amount of memory that the StringBuilder or StringBuffer has allocated for storing characters.
         * new StringBuilder(5) will result in defining the capacity of the StringBuilder->capacity=5, length = 0;
         * new StringBuilder("test") will define the length = 4 and capacity = ?
         * when the length is greater than the capacity will be increased(doubled when I tried)*/

        /**6.Array and ArrayList
         * They are ordered and they are NOT immutable
         * Array has a fixed size but ArrayList doesn't*/

        /**7.Two Arrays with the same content are not equal but
         * !!!Two ArrayList with the same content are equal!(Chapter 3 \ question 19.B" */

        /** DATEs ARE IMUTABLE! */
    }

}
