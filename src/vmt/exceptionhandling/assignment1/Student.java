package vmt.exceptionhandling.assignment1;

public class Student {
    private static long studentId;
     private User user;

    public Student() {
        studentId++;
    }
    public Student(User user) {
        this.user = user;
        studentId++;
    }

    public static long getStudentId() {
        return studentId;
    }

    public static void setStudentId(long studentId) {
        Student.studentId = studentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId +
                ", user=" + user +
                '}'+"\n";
    }
}
