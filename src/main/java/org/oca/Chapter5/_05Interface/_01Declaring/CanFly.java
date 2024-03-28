package org.oca.Chapter5._05Interface._01Declaring;

public abstract interface CanFly {  /**the abstract keyword is not mandatory, if it is missing, it will be added automatically by the compiler */

    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();

}


