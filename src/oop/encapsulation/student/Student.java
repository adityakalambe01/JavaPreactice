package oop.encapsulation.student;

import oop.encapsulation.Address;

public class Student {
    private int studentId;
    private String studentName;
    private Address studentAddress;
    private long studentContactNumber;
    private String studentBranch;
    private String studentEmail;

    public Student() {

    }

    public Student(int studentId, String studentName, Address studentAddress, long studentContactNumber, String studentBranch, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentContactNumber = studentContactNumber;
        this.studentBranch = studentBranch;
        this.studentEmail = studentEmail;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(Address studentAddress) {
        this.studentAddress = studentAddress;
    }

    public long getStudentContactNumber() {
        return studentContactNumber;
    }

    public void setStudentContactNumber(long studentContactNumber) {
        this.studentContactNumber = studentContactNumber;
    }

    public String getStudentBranch() {
        return studentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        this.studentBranch = studentBranch;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress=" + studentAddress +
                ", studentContactNumber=" + studentContactNumber +
                ", studentBranch='" + studentBranch + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
