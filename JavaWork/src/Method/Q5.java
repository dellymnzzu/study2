package Method;

import java.util.Scanner;

public class Q5 {

    /*
     * 계산기 함수화
     * 연산자 입력 : +
     * 숫자 1,2입력
     * 결과값 출력
     * 연산자가 잘못 입력되면 잘못된 연산자입니다 출력
     * 나눗셈은 소숫점 첫자리까지 출력하기 (double형으로 출력)
     *
     *
     *
     * */

    //1. 메인문에서 Scanner 입력
    // 2. 더하기 메소드
    // 3. 곱하기 메소드
    // 4. 빼기 메소드
    // 5. 나누기 메소드
    // 6. 출력 메소드

    static int sum(int num1, int num2) {
        // 주고 받고
        return num1 + num2;
    }

    static int mul() {
        // 주고 안 받고
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력");
        int num2 = sc.nextInt();
        return num1 * num2;


    }

    static void minus(int num1, int num2) {
        // 안주고 받고
        System.out.println("결과 값 : " + (num1 - num2));

    }

    static void divi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력");
        int num2 = sc.nextInt();
        double result = (double) num1 / num2;
        System.out.println("결과 값 : " + result);

        // 안주고 안 받고

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 입력 : ");
        String text = sc.next();


        if (text.equals("+") || text.equals("*") || text.equals("-") || text.equals("/")) {
            if (text.equals("+")) {
                System.out.print("숫자 1 입력 : ");
                int num1 = sc.nextInt();
                System.out.print("숫자 2 입력");
                int num2 = sc.nextInt();
                System.out.println("결과 값: " + sum(num1, num2));

            } else if (text.equals("*")) {
                System.out.println("결과 값 : " + mul());
            } else if (text.equals("-")) {
                System.out.print("숫자 1 입력 : ");
                int num1 = sc.nextInt();
                System.out.print("숫자 2 입력");
                int num2 = sc.nextInt();
                minus(num1, num2);
            } else {
                divi();
            }
        } else {
            System.out.println("잘못된 연산자 입니다.");
        }
        
    }
}
