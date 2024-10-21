package Day5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] seat = new boolean[9][2];  // false

        int result = 18;

        while (result > 0) {
            System.out.println("행의 좌석을 입력해주세요. (" + result + " 석)");
            System.out.println("열의 좌석을 입력해주세요.");
            int h = sc.nextInt();  // 행의 길이
            System.out.println("열의 좌석을 입력해주세요.");
            int y = sc.nextInt(); // 열의 길이

            if (h > 9 || h < 1 || y > 2 || y < 1) {
                System.out.println("잘못된 입력입니다.");
            } else {
                if (seat[h - 1][y - 1]) {
                    System.out.print("비어있는 좌석");
                    for (int i = 0; i < seat.length; i++) {
                        for (int j = 0; j < seat[i].length; j++) {
                            if (!seat[i][j]) {
                                System.out.println("행 : " + (i + 1) + "열 " + (j + 1));
                            }
                        }

                    }
                } else {
                    System.out.println("예약이 완료됐습니다.");
                    seat[h - 1][y - 1] = true;
                    result--;
                }
            }


        }
        System.out.println("예약이 끝났습니다.");

    }
}
