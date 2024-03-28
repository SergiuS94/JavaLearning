package org.oca.Chapter4._05Constructors;

public class _01_CreatingConstructor {

    /** A constructor is a special method that matches the name of the class and has no return type, not even void!
     * The name of the constructor is key sensitive, so it must match 100% the name of the class
     *
     * The Constructors are used when creating a new object. This process is called instantiation because it creates a new instance of the class.
     * The Constructor is called when we write new, followed by the name of the class we want to instantiate, for ex: new Bunny()
     * When Java sees the new keyword, it allocates memory for the new object. Java also looks for a constructor and calls it
     * A constructor is typically used to initialize instance variables
     * "this" keyword tells Java you want to reference an instance variable
     * Most of the time, "this" keyword is optional, it is used only when there are two variables with the same name (one is a parameter and one is an instance variable)
     * If you don't specify which one to use, Java will pick the most granular scope, the parameter.
     *
     * */

    private String color; //defining an instance variable

    public _01_CreatingConstructor(){
        System.out.println("Constructor");
    }

    private _01_CreatingConstructor(String color){
        this.color = color; //assigning to the instance variable color, the value of the parameter color
    }

    public static void main(String[] args) {
         new _01_CreatingConstructor("asd");
    }

}
