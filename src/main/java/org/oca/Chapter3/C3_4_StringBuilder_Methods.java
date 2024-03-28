package org.oca.Chapter3;

public class C3_4_StringBuilder_Methods {
    public static void main(String[] args) {
        //charAt, indexOf, length, substring -> ca la String
        //1.append
        StringBuilder sb = new StringBuilder("abc");
        sb.append("d");
        System.out.println("1.Appending d to abc" + sb);//abcd

        //2.insert -> adds a character at the desired position
        sb.insert(1, "-");//a-bcd
        System.out.println("2.After inserting - at position 1:" + sb);//a-bcd

        //3.delete
        sb.delete(1, 2);//it will remove the character from position 1
        System.out.println("3.After deleting the char at pos 1:" + sb);//abcd
        //deleting a char that doesn't exist will result into an exception

        //4.deleteCharAt()
        sb.deleteCharAt(0);//folositor cand vrei sa stergi doar un caracter
        System.out.println("4.After deleting the first character:" + sb);//bcd

        //5.reverse
        sb.reverse();
        System.out.println("5.After reversing bcd:" + sb);//dcb

        //6.toString()
        String s = sb.toString();
        System.out.println("6.After transforming it to stirng" + s);//bcd
        //the other String methods aren't available to stringbuilder.
        //this is why in some cases we need to transform our stringbuilder to string, ex for toLowerCase()



    }
}
