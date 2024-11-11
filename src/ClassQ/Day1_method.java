package ClassQ;

/*
숫자 2개를 입력받아서 더하기 빼기 결과값을 출력하는 프로그램 만들기

1. 숫자 2개를 입력받기 (scanner 정수 변수 2개 필요 )
2. 더하기 연산 출력
3.빼기 연산 출력
*/

// 첫번째 숫자 2개 받기 (입력 메소드 하나 )
// 더하기 메소드
// 빼기 메소드
// 출력 메소드


import java.util.Scanner;

public class Day1_method {



    static int sumMethod(int num1, int num2){

        return num1+num2;


    }
    static int minusMethod(int num1,int num2){

        return num1-num2;

    }

    static void print(int num1, int num2){
        System.out.println("더하기 연산 : "+sumMethod(num1,num2));  // 더하기 메소드
        System.out.println("빼기 연산 : "+minusMethod(num1,num2)); // 빼기 메소드

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력");
        int num2 = sc.nextInt();
        print(num1,num2);

    }



}
