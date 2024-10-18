package Day01;

import java.util.Scanner;

/*
숫자 2개를 입력받아서 더하기 빼기 결과값을 출력하는 프로그램 만들기

1. 숫자 2개를 입력받기 (scanner 정수 변수 2개 필요 )
2. 더하기 연산 출력
3.빼기 연산 출력
*/

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 준비
        System.out.print("정수를 두번 입력하세요: "); // 정수 입력
        //숫자 1 입력
        int a = sc.nextInt();  // 정수를 입력받는다 (한개의 값)
        //숫자 2 입력
        int b = sc.nextInt(); // 정수를 입력받는다 (두개의 값)
        // 더하기 결과값 출력
        System.out.println("더한 값은  :" +(a+b));
        // 빼기 결과값 출력
        System.out.println(" 뺀 값은  :" +(a-b));

        // 두개 입력 ;
        System.out.printf("더한 값은 %d, 뺀 값은 %d",(a+b),(a-b));
    }
}
