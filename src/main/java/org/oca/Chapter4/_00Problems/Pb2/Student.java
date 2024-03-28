package org.oca.Chapter4._00Problems.Pb2;

public class Student {
    String prenume;
    String nume;
    int varsta;
    long mediaAnuala;

    public Student() {
        prenume = "faraPrenume";
        nume = "faraNume";
        varsta = 0;
        mediaAnuala = (long) 0.0;
    }

    public Student(String prenume, String nume, int varsta, long mediaAnuala) {
        this.prenume = prenume;
        this.nume = nume;
        this.varsta = varsta;
        this.mediaAnuala = mediaAnuala;
    }


}
