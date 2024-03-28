package org.oca.Chapter3;

public class C3_1_Strings {
    public static void main(String[] args) {
        String nume = "Peterfi";    //declarare string
        String prenume = "Andrei";
        //!!!String is immutable
        /**1.Concatenare*/
        String fullname = nume + " " + prenume;
        System.out.println("Numele intreg este:" + fullname);

        /**2.transformare String in litere mici - variabila.toLowerCase()   */
        System.out.println("Numele intreg folosind litere mici:" + fullname.toLowerCase());

        /**3.transformare String in litere mari - variabila.toUpperCase()   */
        System.out.println("Numele intreg folosind litere mari:" + fullname.toUpperCase());


        /**4.Cum arata variabila fullname dupa pasul 2 si 3?
         * R:Exact ca la pasul 1.
         * Folosind .toLowerCase() sau .toUperCase() nu am salvat in variabila fullname noua varianta, ci doar l-am afisat modificat
         * pentru a se fi salvat trebuia sa facem asa: fullname = fullname.toLowerCase();
         */

        /**5.Substring\
         * a)String substring(int beginIndex)	It returns the substring for the starting index
         * */
        System.out.println("Noul String pornind de la al 2-lea caracter este:" + fullname.substring(1)); //al 2-lea caracter e 1, numerotarea e de la 0
        /** b)String substring(int beginIndex, int endIndex)	It returns the substring for the starting index to the endIndex*/
        System.out.println("Noul String dintre pozitiile 3-7 este:" + fullname.substring(2, 6));

        /**6.Lungime String: variabila.length(); */
        System.out.println("Lungimea prenumelui " + prenume + " este:" + prenume.length());
        //Peterfi Andrei
        /**7.Index Substring: variabila.indexOf("and");  */
        System.out.println("Prima aparitie a stringului \"and\" in fullname este pe pozitia:" + fullname.indexOf("and"));
        //rezultatul e -1, pentru ca 'and' nu a fost gasit, e key sensitive, daca reluam avem asa:
        System.out.println("Prima aparitie a stringului \"And\" in fullname este pe pozitia:" + fullname.indexOf("And"));
        //vom avea ca rezultat 8 (reminder, numaratoarea incepe de la 0)

        /**8.charAt() */
        System.out.println("Caracterul de la indexul 0 este:" + fullname.charAt(0));
        //Va afisa caracterul de la indexul 0. Daca indexul cerut e inafara lungimii maxime, va rezulta intr-o exceptie

        /**9.Replace char/string: variabila.ReplaceAll("ce sa caute","cu ce sa inlocuiasca"); */
        System.out.println("Numele intreg inlociund litera i cu x va arata astfel:" + fullname.replaceAll("i", "x"));
        System.out.println("Numele intreg stergand spatiul va arata astfel:" + fullname.replaceAll(" ", ""));
        System.out.println("Numele intreg stergand vocalele:" + fullname.replaceAll("[aeiouAEIOU]", ""));
        //strict pentru situatia de mai sus, se folosesc paranteze patrate pentru a exprima ca se doreste stergea mai multor caracatere, nu a unui substring

        /**10. equals and equalsIgnoreCase()
         * -Verifica daca continutul variabilei e acelasi tinand cont sau nu de case
         */
        System.out.println("\nabc == ABC(case):" + "abc".equals("ABC"));//false
        System.out.println("abc == ABC(Ignorecase):" + "abc".equalsIgnoreCase("ABC"));//true

        /**11.startsWith() endsWith() */
        System.out.println("\nabc incepe cu a?:" + "abc".startsWith("a"));//true
        System.out.println("abc incepe cu A?:" + "abc".startsWith("A"));//false

        System.out.println("abc se incheie cu c?:" + "abc".endsWith("c"));//true
        System.out.println("abc se incheie cu C?:" + "abc".endsWith("C"));//false

        /**11.trim
         * Removes the withe spaces from the beginning and from the end of a String
         * It includes spaces, tabs(/t) or new lines (/n)
         * */
        System.out.println();
        System.out.println("\t    a b c\n");//  a b c
        System.out.println("\t    a b c\n".trim());//a b c->spatiile dintre se pastreaza
        System.out.println("after trim, the \\n was deleted too");

    }

}
