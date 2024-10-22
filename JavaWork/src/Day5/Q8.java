package Day5;

import java.util.Random;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] lake = new boolean[5][5];  // 5*5  불리언 배열을 객체 생성하고 lake에 대입
        Random r = new Random();  //랜덤객체를 생성해서 변수 r에 대입

// i가 0부터 3미만까지 반복
        for (int i = 0; i < 3; i++) {
            int h = r.nextInt(5);   // 0~4 난수를 받아서 정수 변수 h에 대입
            System.out.println(h);

            int y = r.nextInt(5);   // 0~4 난수를 받아서 정수 변수 y에 대입
            System.out.println(y);
            // 5*5 배열에 h행과 y열에 값이 true이면 실행
            if (lake[h][y]) {  // for문 초기화 변수 i를 1 감소
                i--;
            } else {  // false이면 실행
                lake[h][y] = true;  // 5*5 배열에 h행과 y열 안에 값을 true로 변경
            }
        }
        //5x5 호수
        for (int i = 0; i < lake.length; i++) {
            for (int j = 0; j < lake[i].length; j++) {
                if (lake[i][j]) {
                    System.out.print("● ");
                } else {
                    System.out.print("○ ");
                }
            }
            System.out.println();
        }
        while (true) {
            System.out.print("몇행");
            int w = sc.nextInt();
            System.out.print("몇열");
            int he = sc.nextInt();
            if (w > 5 || he > 5) {
                System.out.println("다시 캐스팅해주세요. ");
            } else {
                System.out.println("1.위쪽 2.아래 3.왼쪽 4. 오른쪽 중 하나를 입력해주세요. ");
                int inPut = sc.nextInt();
                switch (inPut) {
                    case 1:  // 위로 이동
                        if (he > 0) he--;
                        break;
                    case 2:  // 아래로 이동
                        if (he < 4) he++;
                        break;
                    case 3:  // 왼쪽으로 이동
                        if (w > 0) w--;
                        break;
                    case 4:  // 오른쪽으로 이동
                        if (w < 4) w++;
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 1~4 중에서 선택해주세요.");
                        continue;
                }
                System.out.println("");


            }


        }
    }
}
