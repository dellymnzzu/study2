package Day3;

import java.util.Scanner;

/*
숫자 입력 : 10
짝수 2468
홀수 13579*/
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        System.out.print("짝수 ");
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) { // 짝수
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.print("홀수 ");

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }

        }


    }
}
