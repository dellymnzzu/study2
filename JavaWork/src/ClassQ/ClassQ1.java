package ClassQ;
// 연필 함수 (빨강 파란 주황 노란색)
// 지우개 함수 (잠자리, 모닝글로리 )
// 펜 함수(검정색-모나미 , 초록 - 제트스트림 , 베이비블루 -워터 맨)

class Pencil {
    String color;

    void print(String color) {
        System.out.println("쓰기 기능은 " + color + "색 연필로 적습니다. ");

    }
}

class Eraser {
    String mf;

    void print(String mf) {
        System.out.println("지우개는 " + mf + "의 제품으로 지웁니다. ");
    }
}

class Pen {
    String name;
    String color;

    void print(String name, String color) {
        System.out.println("펜을 " + name + "의 " + color + "으로 씁니다. ");

    }
}


public class ClassQ1 {
    public static void main(String[] args) {
        Pencil pencil = new Pencil();
        Eraser eraser = new Eraser();
        Pen pen = new Pen();

        pencil.print("빨강");
        pencil.print("파란");
        pencil.print("주황");
        pencil.print("노란");

        eraser.print("잠자리");
        eraser.print("모닝글로리");

        pen.print("검정색", "모나미");
        pen.print("초록색", "제트스트림");
        pen.print("베이비블루", "워터맨");

    }
}
