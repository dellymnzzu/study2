package Day11;


class Student {  // 디폴트
    int studentId; // 디폴트
    private String studentName; // 프라이빗
    int grade;
    String address;

    public String getStudentName() {  // static이면 나갈 수 있지만, 디폴트이기 때문에 외부로 나갈 수 없다.
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

}

public class PrivateTest {
    public static void main(String[] args) {
        Student student = new Student();
        //student.studentName = "김민주 "; // studentName이 프라이빗하기 때문에 안된다.
        // get-set 메소드를 통해서 사용가능
        student.setStudentName("김민주");
        System.out.println(student.getStudentName());
    }

}
