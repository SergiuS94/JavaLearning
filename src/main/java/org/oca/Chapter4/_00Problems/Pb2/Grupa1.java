package org.oca.Chapter4._00Problems.Pb2;

public class Grupa1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.nume);
        System.out.println(student1.prenume);
        student1.nume = "Sepciu";
        student1.prenume = "Florin";
        student1.varsta = 28;
        student1.mediaAnuala = (long) 10.0;

        Student student2 = new Student("Andrei", "Peterfi", 28, (long) 28);
        System.out.println("numele meu este" + student2.nume);


    }


}
