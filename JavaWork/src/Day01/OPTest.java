package Day01;

public class OPTest {
    public static void main(String[] args) {
        int mathScore = 90;
        int engScore = 70;

        int totalScore = mathScore + engScore;
        System.out.println((totalScore));
        double avgScore = totalScore/2.0;
        System.out.println(avgScore);

        System.out.println(6912394 % 3);
        int a = 10;
        System.out.println(a++);
        System.out.println(++a);

        int b = 10;
        int c = 12;
        int d = 10;

        System.out.println(b == c);
        System.out.println(b != c);
        System.out.println(b >= c);
        System.out.println(b <= c);
        System.out.println(c < b);
        System.out.println(5 > 3 && 4 == 7 || 3 != 7);  // 1 true 2. false 3. true라서 true가 된다.


        int e = 10;
        int f = 5;
        e += f;
        System.out.println(e);
        e -= f;
        System.out.println(e);

        int x = e == 10 ? 1 : 0;
        System.out.println(x);


    }
}
