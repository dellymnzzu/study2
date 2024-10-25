package Day9;

class X {
    int a;
    String str;
    B b;  // 새롭게 선언한 것.
//    X(){
//        b = new B();
//    } // 가능하다.

}

class B {
    int k;
}

class D {
    B b = new B();
}

public class HasTest1 {
    public static void main(String[] args) {
        X x = new X();
        x.b = new B();
        x.b.k = 30; // 무조건 x.b 아래에 넣어야한다.
        System.out.println(x.b.k);

        D d = new D();
        d.b.k = 20;
        System.out.println(d.b.k);
        d.b = new B();
        System.out.println(d.b.k);  //0이 나온다. 그 이유는 새로 선언을 해줘서 d.b.k의
        // 값이 초기화 되기 때문에
    }
}
