package Day4;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int com = r.nextInt(100) + 1;
        int cnt = 0;

        while (true) {
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();

            if (com > num) {
                System.out.println("업");
                cnt++;
            } else if (com < num) {
                System.out.println("다운");
                cnt++;
            } else {
                System.out.println("맞췄습니다. 축하합니다!");
                System.out.println(cnt);
                break;
            }


        }


    }
}
