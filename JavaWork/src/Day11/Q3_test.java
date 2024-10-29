package Day11;

import java.util.Random;
import java.util.Scanner;

class Human {
    boolean check;

    void print() {
        if (check) {
            System.out.println("네 제가 마피아입니다. ");
        } else {
            System.out.println("억울합니다. 저는 마피아가 아닙니다. ");
        }
    }
}

class Police {
    int input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("마피아는?");
        return sc.nextInt();
    }
}

public class Q3_test {
    public static void main(String[] args) {
        Random r = new Random();
        Human[] humans = new Human[5];
        Police p = new Police();
        int num = r.nextInt(5);
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }
        humans[num].check = true;
        while (true) {
            int pNum = p.input();
            if (pNum > 0 && pNum < 6) {//1~5 인덱스는 0~4
                humans[pNum - 1].print();
                if (humans[pNum - 1].check) {
                    break;
                }
            } else {
                System.out.println("잘못된 입력입니다. ");
            }
        }


    }
}
