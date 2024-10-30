package Method;


// 두 정수의 나눗셈 결과를 구해주는 메소드
// 입력문
// 출력문
// 연산문


// 1. 두개의 정수를 입력을 받는다.
// 2. 입력받은 두개의 정수를 나눠준다.
// 3. 나눈 결과를 메인문에 출력해준다.

import java.util.Scanner;


public class Q4 {
    static int[] inPut() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.print("num1을 입력하세요: ");
        arr[0] = sc.nextInt();
        System.out.print("num2을 입력하세요: ");
        arr[1] = sc.nextInt();
        return arr;

    }

    static double division() {
        int[] arr = inPut();

        double result = (arr[0] / arr[1]);
        return result;


    }


    public static void main(String[] args) {
        System.out.println(division());

    }
}
