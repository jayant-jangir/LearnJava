public class Student {



    public static void main(String[] args) {
        StudentOfAcad std = new StudentOfAcad();
        std.display();

        StudentOfAcad std2 = new StudentOfAcad();
        std2.setName("John Doe");
        std2.setDepartment("CSE");
        std2.setRollNo(1234);
        std2.setMarks(90.0f);
        std2.display();

        StudentOfAcad std3 = new StudentOfAcad(1235, "Jayant Jangir", "ECE");
        std3.display();
    }

}

class StudentOfAcad {
    int rollNo;
    float marks;
    String name;
    String department;

    StudentOfAcad () {
        this.rollNo = 0;
        this.marks = 0.0f;
        this.name = "";
        this.department = "";
    }

    StudentOfAcad(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.marks = 0.00f;
    }

    StudentOfAcad(int rollNo, float marks, String name, String department) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Roll No: " + this.getRollNo());
        System.out.println("Name: " + this.getName());
        System.out.println("Department: " + this.getDepartment());
        System.out.println("Marks: " + this.getMarks());
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
