package org.oca.Chapter4._08LambdaExpression._00Introduction;

public class  _00Lambdas {

    /** In the following two examples we can see how lambdas work
     *  In the first one we had to create a class to check if an animal canHop.
     *  Now if we want to do the same and check if the animal canSwim, we have to create a new class, implement the same class, and then we could do that check
     *  By using lambdas we don't have to create those classes, we can directly call the interface with the check that we want
     *
     *  The Lambda Syntax looks like this:
     *  parameter name     arrow         body
     *           a         ->      a.canHop()
     *  Another example with optional parts:
     *  (Animal a) -> {return a.canHop();}
     *  if we have more variables on the left we include them between () oro only () -> means zero variables
     *  optional parameter type = Animal
     *  the return and ; are required because we added the {}, but none of them are required unless we use more line of code in that part
     *
     *  Lambdas cannot access all variables. Instance and static variables are okay, but method parameters and local variables are fine if they are not assigned new values.
     *
     *  Negative scenarios:
     *  (a,b) -> {int a = 0; return 5;} //doesn't compile because we try to redeclare a
     *  (a,b) -> {int c = 0; return 5;} //this example works, because we are using a different variable name
     * */




    public static void main(String[] args) {
        System.out.println("test");
    }
}
