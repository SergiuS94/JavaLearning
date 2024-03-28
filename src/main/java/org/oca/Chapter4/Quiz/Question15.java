package org.oca.Chapter4.Quiz;

public class Question15 {
    public void print(byte x) {
        System.out.print("byte");
    }

    public void print(int x) {
        System.out.print("int");
    }

    public void print(short x) {
        System.out.print("short");
    }

    public void print(float x) {
        System.out.print("float");
    }

    public void print(Object x) {
        System.out.print("Object");
    }

    public static void main(String[] args) {
        Question15 t = new Question15();
        short s = 123;
        t.print(s);
        t.print(true);

        t.print(6.22); //specifici ca e f, altfel e luat ca double
    }
}