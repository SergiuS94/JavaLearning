package org.oca.Chapter1;

public class C1_1_VariableScope {

    //andrei >=0
    private int andrei = 0;

    public void setValue(int x) {
        if (x >= 0)
            andrei = x;
    }

    public int getValue() {
        return andrei;
    }


}
