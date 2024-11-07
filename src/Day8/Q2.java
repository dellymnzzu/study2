package Day8;

import java.util.Scanner;

public class Q2 {

    static int[] inputSeat(Scanner sc, int count) {
        int[] hy = new int[2];
        System.out.println("예약하실 좌석을 입력해주세요.(" + count + "석) : ");
        System.out.print("행 : ");
        hy[0] = sc.nextInt();
        System.out.print("열 : ");
        hy[1] = sc.nextInt();
        return hy;
    }

    static int wrongCheck(int[] hy, boolean[][] seat, int count) {
        if (hy[0] > 9 || hy[0] < 1 || hy[1] > 2 || hy[1] < 1) {
            System.out.println("잘못된 입력입니다.");
            return count;
        } else {
            return seatCheck(seat, hy, count);
        }
    }

    static int seatCheck(boolean[][] seat, int[] hy, int count) {
        if (seat[hy[0] - 1][hy[1] - 1]) { //true
            seatPrint(seat);
            return count;
        } else {
            return reserve(seat, hy, count);
        }
    }

    static int reserve(boolean[][] seat, int[] hy, int count) {
        System.out.println("예약이 완료 됐습니다.");
        seat[hy[0] - 1][hy[1] - 1] = true;
        count--;
        return count;
    }

    static void seatPrint(boolean[][] seat) {
        System.out.print("비어 있는 좌석");
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                //false 출력
                if (!seat[i][j]) {
                    System.out.println("행 : " + (i + 1) + "열 : " + (j + 1));
                }
            }
        }
    }

    public static void main(String[] args) {
        //입력 객체 생성
        Scanner sc = new Scanner(System.in);
        //비행기 좌석 배열 생성
        boolean[][] seat = new boolean[9][2]; // false

        int count = 18;

        while (count > 0) {
            int[] hy = inputSeat(sc, count);
            count = wrongCheck(hy, seat, count);
        }
        System.out.println("모든 자리가 예약 됐습니다.");
        //너무 쉽죠!
    }
}
