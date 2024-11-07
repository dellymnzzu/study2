package Day3;

import java.util.Random;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();


        while (true) {
            System.out.print("게임시작이나 종료를 눌러주세요. ");
            int start = sc.nextInt();
            if (start == 1) {
                System.out.print("가위(1),바위(2),보(3)를 선택해주세요. ");
                int num = sc.nextInt();
                int com = r.nextInt(3);
                if (num > 3 && num < 0) {
                    System.out.println("다시 입력해주세요.");
                } else {
                    switch (num - com) {
                        case 1:
                        case -2:
                            System.out.println("User 승");
                            break;

                        case -1:
                        case 2:
                            System.out.println("Com 승");
                            break;
                        default:
                            System.out.println("비김");
                            break;


                    }

                }
            } else {
                System.out.println("게임 종료");
                break;

            }
        }


    }


}

