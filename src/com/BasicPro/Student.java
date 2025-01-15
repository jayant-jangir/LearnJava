package com.BasicPro;
public class Student {

    public static void main(String[] args) {
        Corporate corp = new Corporate();
        corp.display();
    }

}


class StudentOfAcad {
    int rollNo;
    float marks;
    String name;
    String department;
    static int totalEnrollment;

    static {
        totalEnrollment = 0;
    }

    static StudentOfAcad instance;

    public static StudentOfAcad getInstance(int rollNo, float marks, String name, String department) {
        if (instance == null) {
            instance = new StudentOfAcad(rollNo, marks, name, department);
            setTotalEnrollment();
        }
        return instance;
    }

    public int getTotalEnrollment() {
        return StudentOfAcad.totalEnrollment;
    }

    public static void setTotalEnrollment() {
        StudentOfAcad.totalEnrollment = StudentOfAcad.totalEnrollment + 1;
    }

    StudentOfAcad () {
        this.rollNo = 0;
        this.marks = 0.0f;
        this.name = null;
        this.department = null;
        setTotalEnrollment();
    }

    StudentOfAcad(StudentOfAcad other) {
        this.rollNo = other.rollNo;
        this.marks = other.marks;
        this.name = other.name;
        this.department = other.department;
        setTotalEnrollment();
    }

    StudentOfAcad(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.marks = 0.00f;
        setTotalEnrollment();
    }

    StudentOfAcad(int rollNo, float marks, String name, String department) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
        this.department = department;
        setTotalEnrollment();
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Roll No: " + this.getRollNo());
        System.out.println("Name: " + this.getName());
        System.out.println("Department: " + this.getDepartment());
        System.out.println("Marks: " + this.getMarks());
        System.out.println("Total Enrollment: " + StudentOfAcad.totalEnrollment);
        System.out.println();
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

class Corporate extends StudentOfAcad {
    String companyName;

    Corporate() {
        super();
        this.companyName = null;
    }

    public Corporate(int rollNo, float marks, String name, String department, String companyName) {
        super(rollNo, marks, name, department);
        this.companyName = companyName;
    }

    public Corporate(Corporate other) {
        super(other);
        this.companyName = other.companyName;
    }
}


