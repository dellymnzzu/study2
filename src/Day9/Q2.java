package Day9;

import java.util.Random;

class Run {
    String sunsu;
    int num;
    String country;
    int distance = 0;

    Run(String s, int n, String c) {
        sunsu = s;
        num = n;
        country = c;
    }

    void updateDistance(Random r) {
        distance += r.nextInt(10) + 1;
    }

    void output() {
        System.out.println(sunsu + " : " + num + ", " + country + ", " + distance + "M");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();

        Run r1 = new Run("한국 선수", 1, "Korea");
        Run r2 = new Run("중국 선수", 2, "China");
        Run r3 = new Run("미국 선수", 3, "USA");
        Run r4 = new Run("러시아 선수", 4, "Russia");

        while (r1.distance < 100 && r2.distance < 100 && r3.distance < 100 && r4.distance < 100) {
            int event = r.nextInt(4) + 1;
            switch (event) {
                case 1:
                    System.out.println("돌발상황 : 한국");
                    r2.updateDistance(r);
                    r3.updateDistance(r);
                    r4.updateDistance(r);
                    break;
                case 2:
                    System.out.println("돌발상황 : 중국");
                    r1.updateDistance(r);
                    r3.updateDistance(r);
                    r4.updateDistance(r);
                    break;
                case 3:
                    System.out.println("돌발상황 : 미국");
                    r1.updateDistance(r);
                    r2.updateDistance(r);
                    r4.updateDistance(r);
                    break;
                case 4:
                    System.out.println("돌발상황 : 러시아");
                    r1.updateDistance(r);
                    r2.updateDistance(r);
                    r3.updateDistance(r);
            }

            r1.output();
            r2.output();
            r3.output();
            r4.output();

            System.out.println("--------------------");
        }

        System.out.println("경주 종료!");
        if (r1.distance > 100) {
            System.out.println("한국 우승!");
        } else if (r2.distance > 100) {
            System.out.println("중국 우승");
        } else if (r3.distance > 100) {
            System.out.println("미국 우숭!");
        } else {
            System.out.println("러시아 우승");
        }
    }
}
