package org.oca.Chapter4._07DataEncapsulation;

public class _02_EncapsulationExample {

    private int numEggs;                    //private

    public int getNumEggs() {               //getter
        return numEggs;
    }

    public void setNumEggs(int numEggs) {   //setter
        if (numEggs > 0)                    //guard condition
            this.numEggs = numEggs;
    }

}
