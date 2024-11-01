package Day14;
/*
 * 먹이 필요 - x
 * 상어 - 먹이 배열, 이름, 얼마나 먹었는지 출력 */

import java.util.Random;

class FishFeed {

}

class Shark {
    String name;
    FishFeed[] ff;

    Shark(String name) {
        Random r = new Random();
        this.name = name;
        ff = new FishFeed[r.nextInt(7) + 8];


    }

    //먹이 한 마리씩 먹기
    void eat(FishFeed f) {
        int count = 0;
        while (ff[count] != null) {
            count++;
        }
        ff[count] = f;
    }

    int eatCheck() {
        int count = 0;
        while (count < ff.length && ff[count] != null) {
            count++;
        }
        return count;
    }

    void print() {
        System.out.println(this.name + "상어는 " + eatCheck() + "마리 만큼 먹었습니다.");
    }

}

public class Q2_test {
    public static void main(String[] args) {
        //1. 백마리 먹이 배열
        FishFeed[] ff = new FishFeed[100];
        //2. 물고기 배열 인덱스 관리를 위한 변수
        int fishCount = 0;
        //3. 먹이 실체 생성
        for (int i = 0; i < ff.length; i++) {
            ff[i] = new FishFeed();
        }
        //4. 상어 5마리 배열 생성
        Shark[] s = new Shark[5];

        //5. 상어 5마리 객체 생성
        for (int i = 0; i < s.length; i++) {
            s[i] = new Shark((i + 1) + "번 ");  // 마지막에 ""을 준 이유는 문자열로 출력하고 싶어서
        }
        //6. 상어 먹이 배열 만큼 먹이 먹기
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].ff.length; j++) {
                s[i].eat(ff[fishCount]);
                ff[fishCount] = null;
                fishCount++;

            }
        }
        //7. 출력
        for (int i = 0; i < s.length; i++) {
            s[i].print();
        }

    }
}
