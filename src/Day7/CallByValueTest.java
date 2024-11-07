package Day7;

public class CallByValueTest {
    static void abc(int a) {
        a = 20;
    }  // a는 리턴하지 않아서 함수는 사라진다.

    public static void main(String[] args) {
        int a = 10;
        abc(a);  // a는 10이 나온다.
        System.out.println(a);
    }
}
