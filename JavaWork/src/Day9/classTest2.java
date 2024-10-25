package Day9;

class C {
    int x;
    int k;

    C(int a, int b) {  // 생성자
        x = a;
        k = b;
    }
}

public class classTest2 {
    public static void main(String[] args) {
//        C c1 = new C();  // 인자 값을 넣어줘야한다!
        C c = new C(5, 3);
        C c2 = new C(6, 7);
        System.out.println(c.x + " , " + c.k);
        System.out.println(c2.x + " , " + c2.k);
    }

}
