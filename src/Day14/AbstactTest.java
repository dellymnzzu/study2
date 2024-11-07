package Day14;


abstract class Z {
    int a;

    void abc() {
        System.out.println("ABC"); //일반메소드
    }

    Z(int a, int b) {

    }

    //추상화 클래스
    abstract void def();

    abstract void kor();


}

class X extends Z {
    X() {
        super(5, 6);

    }

    @Override
    void def() {
        System.out.println("def");

    }

    @Override
    void kor() {
        System.out.println("kor");

    }
}

public class AbstactTest {
    public static void main(String[] args) {
        X x = new X();
        x.abc();//부모의 일반 메소드 사용이 가능하다.
        //Z z = new Z(); // Z는 추상화 클래스이기 때문에 객체 생성 X
        Z z = new X(); // 참조 자료형 변환해서 사용은 가능하다.

    }
}
