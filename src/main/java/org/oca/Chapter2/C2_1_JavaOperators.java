package org.oca.Chapter2;

public class C2_1_JavaOperators {
    public static void main(String[] args) {
        /**Unary operators:+,-,!*/
        System.out.println("Unary operators");
        int a = 3 + 5 + 2;
        if (!(a==5))
        {
            System.out.println("a != 5");
        }

        /**Multiplication/Division/Modulus: *,/,% */
        /**Shift operators: <<,>>,>>>   */
        /**Relational operators <<,>>,<=,>=,instanceof   */
        /**Equal: ==,!=   */
        /**Logical operators: &,^,|  */
        /**Short-circuit logical operators: &&,||   */
        /**Ternary operators: boolean expressions ? expression1 : expression2   */
        System.out.println("Ternary operators");
        a = a==10 ? 3 : 10; //if a ==10 then a = 3 else a = 10
        System.out.println(a);


        char c ='a';
        long d = 7 + c;
        System.out.println(d);

        /** ^ e XOR(sau exclusiv)
         * a=0 1 0 1
         * b=0 0 1 1
         * r=0 1 1 0
         * */
    }
}
