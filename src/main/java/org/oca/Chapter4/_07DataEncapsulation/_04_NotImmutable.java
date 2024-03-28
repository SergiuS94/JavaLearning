package org.oca.Chapter4._07DataEncapsulation;

public class _04_NotImmutable {

    private StringBuilder builder;

    public _04_NotImmutable(StringBuilder b){
        builder = b;
    }

    public StringBuilder getBuilder(){
        return builder;         //There is the problem, we are passing the StringBuilder which is mutable, so we give back its reference. We can change the value inside it by having that
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        _04_NotImmutable problem = new _04_NotImmutable(sb);
        sb.append("1");
        StringBuilder gotBuilder = problem.getBuilder();
        gotBuilder.append("2");
        System.out.println(problem.getBuilder());  // will print initial12 because we wrote at the StringBuilder's location directly, without having a setter
        //A solution for this can be found in _05 class
    }

}
