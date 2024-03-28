package org.oca.Chapter5._05Interface._04DefaultInterfaceMeethods.PositiveExample;

public interface IsWarmBlooded {
    boolean hasScales();
    public default double getTemperature(){
        return 10.0;
    }
}
