package org.oca.Chapter5._04Abstract._04DefaultMethods_MultipleInheritance;

//public class _03Cat implements _01Walk, _02Run{ //Doesn't compile
public class _03Cat implements _01Walk{
    public static void main(String[] args) {
        System.out.println(new _03Cat().getSpeed());
    }
}
