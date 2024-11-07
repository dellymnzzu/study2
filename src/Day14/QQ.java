package Day14;


import java.util.Random;

// 색깔은 부모가 가지는게 좋다
abstract class Ani {
    String color;

    Ani() {
        Random r = new Random();
        String[] colors = {"빨간색", "주황색", "노란색", "초록색", "파란색", "남색", "보라색"};
        color = colors[r.nextInt(colors.length)];  // colors의 길이만큼 랜덤해준다.


    }

    abstract void print();  // 추상화 클래스
}

class Dog extends Ani {
    void print() {
        System.out.println("나는 " + color + "강아지 입니다.");
    }
}

class Cat extends Ani {
    @Override
    void print() {
        System.out.println("나는 " + color + "고양이입니다.");
    }
}

class Mia extends Ani {
    @Override
    void print() {
        System.out.println("나는 " + color + "미어캣입니다.");

    }
}

class Panda extends Ani {
    @Override
    void print() {
        System.out.println("나는 " + color + "판다입니다.");
    }

}

public class QQ {

    public static void main(String[] args) {
        Random r = new Random();
        Ani[] woori = new Ani[10];
        for (int i = 0; i < woori.length; i++) {
            int num = r.nextInt(4);
            if (num == 0) {
                woori[i] = new Dog();

            } else if (num == 1) {
                woori[i] = new Cat();
            } else if (num == 2) {
                woori[i] = new Mia();
            } else {
                woori[i] = new Panda();
            }
        }
        for (int i = 0; i < woori.length; i++) {
            woori[i].print();

        }
    }

}
