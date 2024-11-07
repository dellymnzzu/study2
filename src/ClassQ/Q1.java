package ClassQ;


class Student {
    String department;
    int studentID;
}

public class Q1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.department = "김민주";
        student.studentID = 215230072;
        System.out.println(student.department + " 이름과 " + student.studentID + " 입니다.");

    }
}
