package org.oca.Chapter5._01Inheritance._04CallingInheritedClassMembers;

public class Shark extends Fish {
    private int numberOfFins = 8;

    public Shark(int age) {
        super(age);
        this.size = 4;
    }

    public void displaySharkDetails() {
        System.out.println("Shark's age:" + getAge());
        System.out.println("Shark size:" + size);
        System.out.println("No. of fins:" + numberOfFins);
    }

    public void displaySharkDetails2() {
        System.out.println("Shark's age:" + this.getAge());
        System.out.println("Shark size:" + this.size);
        System.out.println("No. of fins:" + this.numberOfFins);
    }

    public void displaySharkDetails3() {
        System.out.println("Shark's age:" + super.getAge());
        System.out.println("Shark size:" + super.size);
        System.out.println("No. of fins:" + this.numberOfFins);
    }

    public void displaySharkDetails4() {
        System.out.println("Shark's age:" + super.getAge());
        System.out.println("Shark size:" + super.size);
//        System.out.println("No. of fins:" + super.numberOfFins); //doesn't compile
    }

}
