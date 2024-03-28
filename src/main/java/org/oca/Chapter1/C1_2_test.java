package org.oca.Chapter1;

public class C1_2_test {

    public static void main(String[] args) {
        C1_1_VariableScope numeObiect = new C1_1_VariableScope();
        int a = numeObiect.getValue();
        System.out.println("andrei =" + a);
        numeObiect.setValue(-1);
        a = numeObiect.getValue();
        System.out.println("andrei =" + a);
        numeObiect.setValue(1);
        a = numeObiect.getValue();
        System.out.println("andrei =" + a);




        System.out.println("E egal cu 1?:" + eEgalCu1(a));

    }


    public static boolean eEgalCu1(int a) {
        return (a == 1);
    }


    //modificator de acces :public, protected, default, private
    //e sau nu static:
    //return type: void(nimic, fara return), int, string, long, short, byte, boolean
    //nume metoda
    //cu sau fara parametrii


}
