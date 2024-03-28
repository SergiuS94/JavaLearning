package org.oca.Chapter5._06Polymorphism._06PolymorphismAndMethodOverriding._03Rule3Example;

public class ChildClass extends ParentClass{

    //3.Overridden methods must use covariant return types.


    @Override
    public Double getNumber() {
        return 2.0;
    }
}
