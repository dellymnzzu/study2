package Day4;

import java.util.Random;
import java.util.Scanner;

public class Q3_1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        while (true) {
            num1 = r.nextInt(9) + 1;
            num2 = r.nextInt(9) + 1;
            num3 = r.nextInt(9) + 1;
            if (num1 != num2 && num1 != num3 && num2 != num3) {
                break;
            }
        }
        System.out.println(num1 + " " + num2 + " " + num3 + " ");
        while (true) {
            System.out.print("첫번재 숫자 : ");
            int user1 = sc.nextInt();
            System.out.print("두번재 숫자 : ");
            int user2 = sc.nextInt();
            System.out.print("세번재 숫자 : ");
            int user3 = sc.nextInt();
            if (user1 > 0 && user1 < 10 && user2 > 0 && user2 < 10 && user3 > 0 && user3 < 10 &&
                    user1 != user2 && user2 != user3 && user1 != user3) {
                int strike = 0;
                int ball = 0;

                if (user1 == num1) {
                    strike++;

                }
                if (user2 == num2) {
                    strike++;
                }
                if (user3 == num3) {
                    strike++;
                }
                if (user1 == num2 || user1 == num3) {
                    ball++;
                }
                if (user2 == num1 || user2 == num3) {
                    ball++;
                }
                if (user3 == num2 || user3 == num1) {
                    ball++;
                }

                if (strike == 0 && ball == 0) {
                    System.out.println("아웃");
                } else if (strike == 3) {
                    System.out.println("홈런입니다.");
                    break;
                } else {
                    System.out.println("Strike : " + strike + ", Ball : " + ball);
                }
            } else {
                System.out.println("잘못된입력입니다.");
            }
        }

    }
}
