package ClassQ;

import java.util.Scanner;

/*
숫자 2개를 입력받아서 더하기 빼기 결과값을 출력하는 프로그램 만들기

1. 숫자 2개를 입력받기 (scanner 정수 변수 2개 필요 )
2. 더하기 연산 출력
3.빼기 연산 출력
*/
public class Day1_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        System.out.println("더하기 연산 : "+(num1+num2));
        System.out.println("빼기 연산 : "+(num1-num2));

    }
}
