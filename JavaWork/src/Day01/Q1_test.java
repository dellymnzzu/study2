package Day01;

/*
숫자 2개를 입력받아서 더하기 빼기 결과값을 출력하는 프로그램 만들기

1. 숫자 2개를 입력받기 (scanner 정수 변수 2개 필요 )
2. 더하기 연산 출력 (클래스 더하기 연산자)
3.빼기 연산 출력 (빼기 연산자)
*/

import java.util.Scanner;

class Sum { // 더하기 연산을 담당하는 클래스

    static int sum(int a, int b) {  // 두개의 정수를 받은 다음 두개를 더한 값을 반환하는 메소드
        return a + b;  // a+b의 값을 반환해준다.

    }


}

class Minus {  // 빼기 연산을 담당하는 클래스

    static int minus(int a, int b) {  // 두개의 정수를 받은 다음 두개를 뺀 값을 반환하는 메소드
        return a - b;  // a-b의 값을 반환해준다.
    }


}

// 여기서 먼저 시작됨
public class Q1_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
        System.out.print("숫자 1을 입력하세요  : ");  // 숫자 1을 입력하세요 :  출력
        int num1 = sc.nextInt();  // 첫번째 숫자를 입력받는다.
        System.out.print("숫자 2를 입력하세요  : "); // 숫자 2를 입력하세요 : 출력
        int num2 = sc.nextInt();  // 두번째 숫자를 입력받는다.

        int s = Sum.sum(num1, num2);  // sum클래스 안에 sum 메소드를 호출하여 더하기 결과를 저장한 값을 s에 넣음
        int m = Minus.minus(num1, num2);  // Minus 클래스 안에 Minus 메소드를 호출하여 빼기 결과를 저장한 값을 m에 넣음

        System.out.println("더하기 연산" + s);  // 더하기 결과 출력
        System.out.println("빼기 연산" + m);  // 빼기 결과 출력


    }
}
