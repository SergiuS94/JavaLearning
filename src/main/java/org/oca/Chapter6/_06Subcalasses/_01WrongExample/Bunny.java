package org.oca.Chapter6._06Subcalasses._01WrongExample;

class CanNotHopException extends Exception{}

public class Bunny extends Hopper {
//    public void hop() throws  CanNotHopException{} //Doesn't compile, you cant add extra exceptions
    public void hop(){}
}

 class Hopper {
    public void hop(){
    }
}