package org.oca.Chapter3;

public class C3_3_StringBuilder {
    /** StringBuilder e mutabil, deci daca il trimiti ca parametru spre o metoda, valoarea acestuia va fi schimbata global
     * In schimb String, sau int, sunt imutabile, odata transmise, nu vor fi modificate global ci doar in interiorul metodei
     *
     * */
    //De fiecare data cand atribuim unui string o alta valoare, se creeaza un nou obiect care ii este asignat, iar vechiul cel mai probabil e eligibil
    //pentru garbage collection. Dar daca faci asta intr-un loop, devine ineficient, o gramada de obiecte create degeaba
    //Pentru asta apare StringBuilder, care spre deosebire de String nu e imutabil
    //StringBuilder isi schimba propria stare si va returna tot o referinta catre el insusi
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("start");
        sb.append("_middle");//adds _midle to sb, and returns a reference to sb which is ignored
        //daca era sa faci asa cu stringuri nu se salva nimic
        StringBuilder same = sb.append("_end");
        System.out.println(same);//"start_middle_end"


        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("d");
        b = b.append("f").append("g");
        System.out.println("a=" + a); //abcdefg
        System.out.println("b=" + b); //abcdefg
        //ambele variabile pointeaza catre aceasi adresa pe care o schimba impreuna, de asta ambele au acelasi rezultat
        //b != new stringbuilder, ci se foloseste de a
    }
}
