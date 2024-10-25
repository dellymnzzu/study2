package Day8;

class A {
    int a;

    void print() {
        System.out.println("a 는 " + a + "입니다.");
    }

}

public class ClassTest1 {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();
        a.a = 20;
        a.print(); //20
        b.print(); //0
    }
}
