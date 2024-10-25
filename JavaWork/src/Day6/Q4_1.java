package Day6;

import java.util.Scanner;

public class Q4_1 {
    static int yak() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        add(num);
        return num;
    }

    static int add(int a) {
        int num = a;
        while (a > 0) {
            if (num % a == 0) {
                chul(a);
                a--;
            }
            a--;
        }

        return a;
    }

    static void chul(int a) {
        System.out.print(a + " ");
    }

    public static void main(String[] args) {
        add(yak());
    }

}
