package Day9;

class Car {  // class Car
    String color;
    String manu;
    int maxSpeed;

    Car(String c, String m, int max) {  // Car생성자이고 멤버 변수 color와 manu, maxSpeed를 넣는다.
        color = c;
        manu = m;
        maxSpeed = max;
    }

    void drive() {  // 메소드 drive 선언
        System.out.println(manu + "의 " + color + "색깔 자동차를 " + maxSpeed + "로 운전합니다.");  // 멤버변수에 선언한 값들을 넣는다.
    }
}

class Bike {
    String manu;
    String function;

    Bike(String m, String f) {  //Bike 생성자이며
        manu = m;
        function = f;
    }

    void ride() {
        System.out.println(manu + "인 자전거의 기능인 " + function + "을 사용해서 자전거를 탑니다.");
    }
}

class Moto {
    String color;
    String manu;
    int maxSpeed;

    Moto(String c, String m, int max) {
        color = c;
        manu = m;
        maxSpeed = max;
    }

    void drive() {
        System.out.println(manu + "의 " + color + "색깔 오토바이를 " + maxSpeed + "로 운전합니다.");
    }
}

class Human1 {  // 사람 Human1 클래스를 주었고
    String name;
    Car c1;  // Human이 Car을 가지고 있는 관계이다. c1은 틴트라고 생각하면 된다.
    Car c2; // Human이 Car을 가지고 있는 관계이다. c2는 틴트 2라고 생각하면 된다.

    Human1(String n, Car car1, Car car2) {
        name = n;
        c1 = car1;
        c2 = car2;
    }

    void dirveC1() {
        System.out.print(name);
        c1.drive();
    }

    void dirveC2() {
        System.out.print(name);
        c2.drive();
    }
}

class Human2 {
    Bike b;
    Moto m;

    Human2(Bike bike, Moto moto) {
        b = bike;
        m = moto;
    }
}

public class Q1 {

    public static void main(String[] args) {
        Car c1 = new Car("은", "Ford", 220);
        Car c2 = new Car("검정", "BMW", 240);
        Car c3 = new Car("하얀", "삼성", 200);
        Car c4 = new Car("형광", "현대", 180);

        Bike b1 = new Bike("삼천리", "산악용");
        Bike b2 = new Bike("자이언트", "접이식용");

        Moto m = new Moto("빨간", "대림", 180);

        c1.drive();
        c2.drive();
        c3.drive();
        c4.drive();

        b1.ride();
        b2.ride();

        m.drive();

        Human1 human1 = new Human1("철수", c2, c4);
        c2 = null;
        c4 = null;
        Human2 human2 = new Human2(b1, m);

        //human1.c1.drive();
        //human1.c2.drive();

        human1.dirveC1();
        human1.dirveC2();

        human2.b.ride();
        human2.m.drive();
    }
}
