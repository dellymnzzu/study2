package ClassQ;


// 개 , 고양이, 새 클래스 생성

// 개 - 색깔, 무게
// 고양이 - 색깔, 무게, 야옹한다.
// 새 - 색깔, 무게, 날아다닌다.
// 개 2마리 고양이 2마리 새 1마리

class Dog {
    String color;
    int kg;

    void print(String color, int kg) {
        System.out.println("멍멍");
    }


}

class Cat {
    String color;
    int kg;

    void print(String color, int kg) {
        System.out.println("야옹");
    }

}

class Bird {
    String color;
    int kg;

    void print(String color, int kg) {
        System.out.println("짹짹");
    }


}


public class ClassQ2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.print("하얀색", 15);
        dog.print("검은색", 20);
        cat.print("흰색", 10);
        cat.print("검은색", 10);
        bird.print("흰색", 1);
    }
}
