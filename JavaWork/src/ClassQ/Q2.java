package ClassQ;


class Student1 {
    private String department;
    private int studentID;

    public String getDepartment() {
        return department + " 학과 ";
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Student1 student1 = new Student1();


        student1.setDepartment("정보통신학과");
        student1.setStudentID(215230072);
        System.out.println("학과 : " + student1.getDepartment());
        System.out.println("학번 : " + student1.getStudentID());


    }

}
