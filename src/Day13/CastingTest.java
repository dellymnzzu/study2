package Day13;


class A {
    int a;
}

class B extends A {
    int b;
}

class C extends A {
    int c;
}

class D extends A {
    int d;
}

public class CastingTest {
    public static void main(String[] args) {
        A a = new B(); // 업캐스팅
//        a.b = 2;  // why? b는 클래스 b에만 있으니까
        B b = (B) a;
        b.a = 20;
        b.b = 30;


        B[] listB = new B[10];
        C[] listC = new C[10];
        D[] listD = new D[10];

        A[] listA = new A[10];
        listA[0] = new B();
        listA[1] = new C();
        listA[2] = new D();

        if (listA[1] != null) {
            if (listA[1] instanceof B) {
                System.out.println("객체 B입니다.");
                B b1 = (B) listA[1];
                b1.b = 30;

            } else if (listA[1] instanceof C) {
                System.out.println("객체 C 입니다.");
                C c1 = (C) listA[1];
                c1.c = 20;
            } else if (listA[1] instanceof D) {
                System.out.println("객체 D 입니다.");
                D d1 = (D) listA[1];
                d1.d = 20;
            } else {
                System.out.println("객체 A 입니다. ");
            }
        }  // 결과 값이 객체 C 입니다.로 나오는 이유는 객체에 C를 넣었기 때문이다.


    }
}
