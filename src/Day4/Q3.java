package Day4;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int user1 = sc.nextInt();
            System.out.print("숫자를 입력하세요: ");

            int user2 = sc.nextInt();
            System.out.print("숫자를 입력하세요: ");

            int user3 = sc.nextInt();
            int num = r.nextInt(9) + 1;
            int num1 = r.nextInt(9) + 1;
            int num2 = r.nextInt(9) + 1;
            int cnt = 0;
            int Bcnt = 0;
            boolean f = true;

            if (num == num1 || num1 == num2 || num == num2) {

                while (true) {
                    if (num == num1) {
                        num = r.nextInt(9) + 1;
                    } else if (num == num2) {
                        num = r.nextInt(9) + 1;

                    } else if (num1 == num2) {
                        num2 = r.nextInt(9) + 1;
                    } else {
                        break;
                    }
                }
                System.out.print(num + " " + num1 + " " + num2 + " ");


            }
            if (user1 == user2 || user1 == user3 || user2 == user3) {
                System.out.println("다시 입력하세요.");
            } else if (user1 != num && user2 != num1 && user3 != num2) {
                System.out.println("아웃입니다.");

            } else if (user1 == num && user2 == num1 && user3 == num2) {
                System.out.println("홈런입니다.");
                f = false;
            } else {
                if (user1 == num || user2 == num1 || user3 == num2) {
                    if (user1 == num) {
                        System.out.print(++cnt + " ");
                        cnt += cnt;
                    }
                    if (user2 == num1) {
                        System.out.print(++cnt + " ");
                        cnt += cnt;
                    }
                    if (user3 == num2) {
                        System.out.print(++cnt + " ");
                        cnt += cnt;
                    }
                    System.out.println("Strike");
                } else {
                    if (user1 == num) {
                        System.out.print(++Bcnt + " ");
                    }
                    if (user1 == num1) {
                        System.out.print(++Bcnt + " ");
                    }
                    if (user1 == num2) {
                        System.out.print(++Bcnt + " ");
                    }

                    if (user2 == num) {
                        System.out.print(++Bcnt + " ");
                    }
                    if (user2 == num1) {
                        System.out.print(++Bcnt + " ");
                    }
                    if (user2 == num2) {
                        System.out.print(++Bcnt + " ");
                    }

                    if (user3 == num) {
                        System.out.print(++Bcnt + " ");
                    }
                    if (user3 == num1) {
                        System.out.print(++Bcnt + " ");
                    }
                    if (user3 == num2) {
                        System.out.print(++Bcnt + " ");
                    }
                    System.out.print("ball");

                }

            }
        }
    }
}
