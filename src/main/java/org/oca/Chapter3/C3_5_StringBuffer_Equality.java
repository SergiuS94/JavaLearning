package org.oca.Chapter3;
import java.lang.String;

public class C3_5_StringBuffer_Equality {
    public static void main(String[] args) {
        StringBuffer one = new StringBuffer();
        StringBuffer two = new StringBuffer();
        StringBuffer three = one.append("a");
        System.out.println("one == two?:" + (one==two));//false
        System.out.println("one == three?:" + (one==three));//true
        //ca la Stringuri, == verifica daca e aceasi referinta

        String x = "Hello World";
        String z = "Hello World";
        System.out.println("x==z?:"+(x==z));//true, nu facem la z = new string, va gasi ca acesta exista, deci
                                                //ambele variabile vor avea aceasi referinta
        String y = " Hello World".trim();//in acest caz, stringul incepe cu un spatiu
                                        //desi dam remove cu trim la acel spatiu, referinta creata initial e una noua
        System.out.println("x==y?:"+(x==y));
        //chiar si daca doar x era facut cu new String ar fi rezultat x == z false. Ai cerut in mod special
        //ca acea variabila sa aiba referinta proprie noua
    }
}
