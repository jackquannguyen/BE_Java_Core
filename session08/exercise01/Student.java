package vn.edu.rikkei.session08.ex01;

public class Student {
    public static int totalStudents = 0;

    private String studentId;
    private String fullName;

    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
        totalStudents++;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void displayInfo() {
        System.out.println("Mã: " + studentId + " | Họ tên: " + fullName);
    }
}
