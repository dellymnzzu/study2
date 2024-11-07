package Day13;

import java.util.Random;
import java.util.Scanner;

/**
 * 포켓몬스터 : 타입, 색깔,사이즈 자기 뭔지 말하는 (기능0\)
 * 생성자(선택)
 * 포켓볼 : 포켓몬 (포켓몬 객체를 여기서 만들면 안됨 why? 포켓볼은 포켓몬 이 아니기 때문에 )
 * 지우 : 포켓볼 오박사 포켓볼 받기. 객체는 필요하지 않는다 그래서 변수만 필요함
 * 오박사 : 포켓볼 3개가 있어야 되고 모두 객체가 들어가야 한다. (오박사가 포켓몬과 함께 태어나지 않으니까 )
 * <p>
 * <p>
 * 지우가 고른다 . -> 지우가 불러서 포켓몬이 말한다.
 */

class PM {  //포켓몬스터
    String type;
    String color;
    String size;
    // 내가 태어날 때 포켓몬이 다 결정 되어있어야 한다.

    PM() {
        Random r = new Random();
        String[] m = {"피카츄", "파이리", "꼬부기", "이상해씨"};
        String[] c = {"노란색", "빨간색", "파란색", "초록색"};
        String[] s = {"대", "중", "소", "미니"};

        this.type = m[r.nextInt(m.length)];
        this.color = c[r.nextInt(c.length)];
        this.size = s[r.nextInt(s.length)];

        talk();
    }

    void talk() {
        System.out.println(this.color + " " + this.type + "이(며)고, 크기는 " + this.size + "입니다.");
    }

}

class PB {
    PM pm;  // 포켓볼은 포켓몬이 있어야 한다.
}

class JW {
    PB ball;// 지우는 포켓볼만 있으면 된다.
}

class Oh {
    PB[] bl = new PB[3];

    Oh() {
        for (int i = 0; i < bl.length; i++) {
            bl[i] = new PB();
        }
    }
}

public class Q3_test {
    public static void main(String[] args) {
        JW j = new JW();
        Oh o = new Oh();
        Scanner sc = new Scanner(System.in);

        //포켓몬 잡기
        for (int i = 0; i < o.bl.length; i++) {
            o.bl[i].pm = new PM();  //잡다.


        }
        while (true) {
            System.out.println("1,2,3 중에 고르세요 : ");
            int num = sc.nextInt();
            if (num == 1 || num == 2 || num == 3) {
                j.ball = o.bl[num - 1];
                o.bl[num - 1] = null;
                break;

            } else {
                System.out.println("잘못된 입력입니다. ");
            }
        }
        j.ball.pm.talk();


    }
}
