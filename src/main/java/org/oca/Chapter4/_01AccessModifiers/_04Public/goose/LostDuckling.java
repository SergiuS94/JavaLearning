package org.oca.Chapter4._01AccessModifiers._04Public.goose;

import AndreiP.OCA.Chapter4._01AccessModifiers._04Public.duck.DuckTeacher;

public class LostDuckling {

    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("Thanks " + teacher.name);
    }
}
