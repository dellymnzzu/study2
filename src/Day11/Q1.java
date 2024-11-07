package Day11;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(32) + 1;
        int user = 0;
        System.out.println(num + " 랜덤 값 ");


        while (num != user) {
            System.out.print("1~31까지의 값을 입력해주세요 : ");
            user = sc.nextInt();

            if (user > 31) {
                System.out.println("잘못된 입력입니다. 1~31까지 입력 해주세요.");
            } else {
                if (user < num) {
                    System.out.println("업");
                } else if (user > num) {
                    System.out.println("다운");
                }


            }

        }
        System.out.println("맞췄습니당.");


    }
}
