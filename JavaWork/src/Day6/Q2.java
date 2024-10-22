package Day6;

import java.util.Scanner;

public class Q2 {

    static int sum(int num1, int num2) {
        // static으로 10을 변경
        return num1 + num2;

    }

    static String mul() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력");
        int num2 = sc.nextInt();
        int sum = num1 * num2;


        return "결과값은 : " + sum;

    }

    static void outputName(int num1, int num2) {
        System.out.println("결과값은 : " + (num1 - num2));
    }

    static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력");
        int num2 = sc.nextInt();
        System.out.println("결과값 : " + num1 / num2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산자 입력");
        String f = sc.next();
        if (f.equals("+")) {
            System.out.print("숫자 1 입력");
            int num1 = sc.nextInt();
            System.out.print("숫자 2 입력");
            int num2 = sc.nextInt();
            System.out.println();
            int result = sum(num1, num2);
            System.out.println("결과값 : " + result + " 입니다.");
        } else if (f.equals("*")) {
            System.out.println(mul());
        } else if (f.equals("-")) {
            System.out.print("숫자 1 입력");
            int num1 = sc.nextInt();
            System.out.print("숫자 2 입력");
            int num2 = sc.nextInt();
            outputName(num1, num2);
        } else if (f.equals("/")) {
            division();

        } else {
            System.out.println("다시 입력해주세요");
        }

    }
}
