package Day8;

class Dog {
    String color;
    int kg;

    void bowl() {
        System.out.println(kg + "kg " + color + "의 개가 짖는다.");
    }
}

class Cat {
    String color;
    int kg;

    void yayong() {
        System.out.println(kg + "kg " + color + "의 고양이가 야옹한다.");
    }
}

class Bird {
    String color;
    int kg;

    void fly() {
        System.out.println(kg + "kg " + color + "의 새가 날아간다.");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.color = "노란색";
        d2.color = "빨간색";
        d1.kg = 3;
        d2.kg = 5;
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        c1.color = "파랑색";
        c2.color = "주황색";
        c1.kg = 2;
        c2.kg = 3;
        Bird b = new Bird();
        b.color = "무지개색";
        b.kg = 1;

        d1.bowl();
        d2.bowl();

        c1.yayong();
        c2.yayong();

        b.fly();

    }
}
