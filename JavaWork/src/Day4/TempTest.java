package Day4;

public class TempTest {
    public static void main(String[] args) {
        int a = 120;
        int b = 36;
        int temp = a;

        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
