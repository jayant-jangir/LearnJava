package com.Clonable;

import java.util.ArrayList;

public class Clonable implements Cloneable{
    int rollno;
    String name;
    ArrayList<Float> marks = new ArrayList<>();

    Clonable (int rollno, String name, ArrayList<Float> marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    Clonable (Clonable other) {
        this.rollno = other.rollno;
        this.name = other.name;
        // Deep copy
        this.marks = new ArrayList<>(other.marks);

        // Shallow copy
//        this.marks = other.marks;
    }



    public Object clone () throws CloneNotSupportedException {
        // Shallow copy
        Clonable copy = (Clonable) super.clone();

        // Deep copy
        copy.marks = new ArrayList<>(this.marks);
        return copy;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Float> marks = new ArrayList<>();
        marks.add(10.0f);
        marks.add(20.0f);
        marks.add(30.0f);
        Clonable c1 = new Clonable(101, "John", marks);
        Clonable c2 = (Clonable) c1.clone();
        c2.name = "Jayant";
        c2.marks.set(0, 100.0f);
        System.out.println(c1.rollno + " " + c1.name + " " + c1.marks);
        System.out.println(c2.rollno + " " + c2.name + " " + c2.marks);
    }
}
