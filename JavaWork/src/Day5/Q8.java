package Day5;

import java.util.Random;

public class Q8 {
    public static void main(String[] args) {
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
    }
}
