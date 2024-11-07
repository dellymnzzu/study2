//package Day10;
//
/// *
// * 연필, 지우개, 펜
// * 필통
// * 학생
// * 문방구
// * 물물교환 일어나는 클래스
// * */
//
//import java.util.Scanner;
//
//class ColorPencil {
//    String color;
//
//    ColorPencil(String color) {
//        this.color = color;
//    }
//}
//
//class Eraser {
//    String color;
//
//    Eraser(String color) {
//        this.color = color;
//    }
//}
//
//class ColorPen {
//    String color;
//
//    ColorPen(String color) {
//        this.color = color;
//    }
//}
//
//class Case {
//    ColorPencil cpc1;
//    ColorPencil cpc2;
//    Eraser e;
//    ColorPen cp1;
//    ColorPen cp2;
//}
//
//class Student {
//    String name;
//    Case c;
//
//    Student(String name) {
//        this.name = name;
//        c = new Case();
//    }
//
//    boolean checkPencil() {
//        if (c.cpc1 == null || c.cpc2 == null) {
//            return true;
//        }
//        return false;   // else 안 하는 이유? 어차피 리턴 문으로 하면 끝남
//    }
//
//    boolean checkEraser() {
//        if (c.e == null) {
//            return true;
//        }
//        return false;   // else 안 하는 이유? 어차피 리턴 문으로 하면 끝남
//    }
//
//    boolean checkPen() {
//        if (c.cpc1 == null || c.cpc2 == null) {
//            return true;
//        }
//        return false;   // else 안 하는 이유? 어차피 리턴 문으로 하면 끝남
//    }
//
//    String tellObject(String str) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(name + str + " 색깔을 골라주세요.");
//        return sc.next();
//    }
//
//    void CasePrint() {
//        System.out.println("========" + this.name + "구매 목록 ============");
//        System.out.println("색연필 1 : " + c.cpc1.color);
//        System.out.println("색연필 2 : " + c.cpc2.color);
//        System.out.println("지우개 : " + c.e.color);
//        System.out.println("칼라펜 1 : " + c.cp1.color);
//        System.out.println("칼라펜 2 : " + c.cp2.color);
//
//
//    }
//}
//
//class MunbanGu {
//    ColorPencil[] cpc = new ColorPencil[4];
//    Eraser[] e = new Eraser[2];
//    ColorPen[] cp = new ColorPen[4];
//
//    MunbanGu() {
//        String[] color = {"주황색", "초록색", "노란색", "파란색"}; // 색연필 색깔 배열
//        String[] color2 = {"회색", "빨간색"}; // 지우개 색깔 배열
//
//        for (int i = 0; i < color.length; i++) {
//            cpc[i] = new ColorPencil(color[i]);
//            cp[i] = new ColorPen(color[i]);
//        }
//        for (int i = 0; i < color2.length; i++) {
//            e[i] = new Eraser(color2[i]);
//        }
//    }
//}
//
//class Controller {
//    void buyPencil(MunbanGu m, Student s, String color) {
//        // 반복 횟수 -> 문방구 연필 배열 길이 만큼
//        // 배열 안에 객체가 있는지 여부 확인
//        // 객체가 있다면 색깔 확인
//        // 위에 모든것이 맞으면 문방구에 있는 연필을 학생에게 준다. -> 줄 때 비어져 있는 곳에 줘야한다.
//        // 그리고 문방구 연필 배열 안에 있는 객체를 null로 바꿔준다.
//
//        int i;
//        for (int i = 0; i < m.cpc.length; i++) {
//            if (m.cpc[i] != null && m.cpc[i].color.equals(color)) {
//                if (s.c.cpc1 == null) {
//                    s.c.cpc1 = m.cpc[i];
//                } else {
//                    s.c.cpc2 = m.cpc[i];
//                }
//                m.cpc[i] = null;
//                System.out.println(s.name + "학생이 샀습니다. ");
//                break;
//
//            }
//        }
//        if (i == m.cpc.length) {
//            System.out.println("벌써 팔렸습니다.");
//        }
//
//
//    }
//
//    void buyPen(MunbanGu m, Student s, String color) {
//        // 반복 횟수 -> 문방구 연필 배열 길이 만큼
//        // 배열 안에 객체가 있는지 여부 확인
//        // 객체가 있다면 색깔 확인
//        // 위에 모든것이 맞으면 문방구에 있는 연필을 학생에게 준다. -> 줄 때 비어져 있는 곳에 줘야한다.
//        // 그리고 문방구 연필 배열 안에 있는 객체를 null로 바꿔준다.
//
//        int i;
//        for (int i = 0; i < m.cp.length; i++) {
//            if (m.cp[i] != null && m.cp[i].color.equals(color)) {
//                if (s.c.cp == null) {
//                    s.c.cp = m.cpc[i];
//                } else {
//                    s.c.cp = m.cp[i];
//                }
//                m.cp[i] = null;
//                System.out.println(s.name + "학생이 샀습니다. ");
//                break;
//
//            }
//        }
//        if (i == m.cpc.length) {
//            System.out.println("벌써 팔렸습니다.");
//        }
//
//
//    }
//
//    void buyEraser(MunbanGu m, Student s, String color) {
//        // 반복 횟수 -> 문방구 연필 배열 길이 만큼
//        // 배열 안에 객체가 있는지 여부 확인
//        // 객체가 있다면 색깔 확인
//        // 위에 모든것이 맞으면 문방구에 있는 연필을 학생에게 준다. -> 줄 때 비어져 있는 곳에 줘야한다.
//        // 그리고 문방구 연필 배열 안에 있는 객체를 null로 바꿔준다.
//
//        int i;
//        for (int i = 0; i < m.e.length; i++) {
//            if (m.e[i] != null && m.e[i].color.equals(color)) {
//                if (s.c.e == null) {
//                    s.c.e = m.e[i];
//                }
//                m.e[i] = null;
//                System.out.println(s.name + "학생이 샀습니다. ");
//                break;
//
//            }
//        }
//        if (i == m.cpc.length) {
//            System.out.println("벌써 팔렸습니다.");
//        }
//
//
//    }
//
//}
//
//
//public class Q3_test {
//    public static void main(String[] args) {
//        MunbanGu m = new MunbanGu(); //펜, 지우개, 연필 객체 만들어짐
//        Student a = new Student("A학생");
//        Student b = new Student("B학생");
//        Controller c = new Controller();
//
//        // 아래 반복을 언제까지? -> 학생의 색연필이 꽉 찼을 때 - > 학생 이 알겠다.
//        // 그래서 학생한테 만들어야함  checkPencil
//        // 1. A 학생이 색연필을 골라야 해서 색까 ㄹ요청 -> Student - > tellObject
//        //check 색깔 범위에 문자열 입력이 아니면 잘못된 입력 처리후 다시 재입력 받습니다.  -> 분기 해결
//        //Controller  -> buyPencil
//        //2. 문방구에 색깔펜이 있는지 확인을 해서 A학생에게 전달
//        //3. 전달이 되면 문방구 색깔펜 객체는 null로 변경
//
//        while (a.checkPencil()) {
//            String color = a.tellObject("색연필");
//            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
//                c.buyPencil(m, a, color);
//            } else {
//                System.out.println("잘못된 입력입니다. ");
//
//            }
//        }
//
//        while (b.checkPencil()) {
//            String color = b.tellObject("색연필");
//            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
//                c.buyPencil(m, b, color);
//            } else {
//                System.out.println("잘못된 입력입니다. ");
//
//            }
//        }
//
//        while (a.checkEraser()) {
//            String color = a.tellObject("지우개");
//            if (color.equals("회색") || color.equals("빨간색")) {
//                c.buyPencil(m, a, color);
//            } else {
//                System.out.println("잘못된 입력입니다. ");
//
//            }
//        }
//        while (b.checkPen()) {
//            String color = b.tellObject("색연필");
//            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
//                c.buyPencil(m, b, color);
//            } else {
//                System.out.println("잘못된 입력입니다. ");
//
//            }
//        }
//
//        while (a.checkPen()) {
//            String color = a.tellObject("색연필");
//            if (color.equals("주황색") || color.equals("초록색") || color.equals("노란색") || color.equals("파란색")) {
//                c.buyPencil(m, a, color);
//            } else {
//                System.out.println("잘못된 입력입니다. ");
//
//            }
//        }
//
//        a.CasePrint();
//        b.CasePrint();
//
//
//    }
//
//}
