package Day9;


class A1 {
    B1 b;

    B1 makeB1() {
        b = new B1();
        return b;
    }
}

class B1 {
    int k;
}

public class ObjectTest {
    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = a.makeB1();
        b.k = 20;
        a.b.k = 30;
        B1 b1 = a.makeB1();

        System.out.println(b.k);
        System.out.println(a.b.k);
        System.out.println(b1.k);
    }

}
