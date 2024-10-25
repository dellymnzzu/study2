package Day9;


class A {
    int a; // 멤버변수

    void print(int a) {
        int b; // 메소드변수 지역변수
    }

    A() { // 디폴트 생성자가 아니다. 선언 안 했을 때 하는게 디폴트 생성자이다.
        a = 10;
    }
}

public class classTest1 {
    public static void main(String[] args) {
        A a = new A();  //일회성으로 불린다.
        System.out.println(a.a);
    }
}

