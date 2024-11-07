package Day10;


class X {
    private int a;

    public int getA() {
        return this.a;
    }

    public void setA(int a) { // 여기서 로그를 넣으면 된다.
        this.a = a;
    }
}

public class AcessTest {
    public static void main(String[] args) {
        X x = new X();  //X객체 생성
        x.setA(5);
        System.out.println(x.getA());
    }
}
