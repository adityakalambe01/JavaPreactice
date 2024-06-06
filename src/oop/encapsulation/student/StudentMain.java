package oop.encapsulation.student;

import oop.encapsulation.Address;

public class StudentMain {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCountry("India");
        address.setState("Maharashtra");
        address.setArea("Karve Nagar");
        address.setPinCode(411052);



        Student student = new Student();
        student.setStudentId(123);
        student.setStudentName("Aditya Kalambe");
        student.setStudentEmail("adityakalambe20@gmail.com");
        student.setStudentContactNumber(78459865);
        student.setStudentBranch("Computer Science");
        student.setStudentAddress(address);


        System.out.println(student);
    }
}
