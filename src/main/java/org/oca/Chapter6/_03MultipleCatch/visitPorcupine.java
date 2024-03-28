package org.oca.Chapter6._03MultipleCatch;

public class visitPorcupine {
    class AnimalsOutForAWalk extends RuntimeException {
    }

    class ExhibitClosed extends RuntimeException {
    }

    class ExhibitClosedForLunch extends ExhibitClosed {
    }
    /** You can catch multiple exceptions by using
     * try{}
     * catch(ExceptionType1 e){}
     * catch(ExceptionType2 e){})
     * The rule here is that the first exception cannot be a superclass of the second because the second will never be called, and we will have a compiler error at the
     * second catch*/
    public static void main(String[] args) {

        try {
            System.out.println("see Animal");
        } catch (AnimalsOutForAWalk e) {
            System.out.println("try back later");
        }catch (ExhibitClosed e){
            System.out.println("Not today");
        }

    }

}
