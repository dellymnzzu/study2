package ClassQ;

class Car {
    String color;
    String mf;
    int speed;

    Car(String c, String m, int s) {
        color = c;
        mf = m;
        speed = s;
    }

    void print() {
        System.out.println("자동차가 존재합니다. 자동차는 " + color + "과" + mf + " " + speed + "을 가지고 있고 운전하는 기능을 가지고 있습니다.");
    }

}

class Cycle {
    String mf;
    String fc;

    Cycle(String m, String f) {
        mf = m;
        fc = f;
    }

    void print() {
        System.out.println("자전거가 존재합니다. 자전거는 " + mf + "와" + fc + "의 기능을 가지고 있습니다.");
    }
}

class Bike {

    String color;
    String mf;
    int speed;

    Bike(String c, String m, int s) {
        color = c;
        mf = m;
        speed = s;
    }

    void print() {
        System.out.println("오토바이가 존재합니다. 오토바이는 " + color + "과 " + mf + " " + speed + "을 가지고 있습니다. 자동차와 똑같이 운전하는 기능을 가지고 있습니다.");
    }
}

class Human1 {
    Car car1;
    Car car2;
}

class Human2 {
    Cycle c;
    Bike b;
}

public class ClassQ3 {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
        Human2 human2 = new Human2();
        human1.car1 = new Car("검정", "BMW", 240);
        human1.car2 = new Car("형광", "현대", 180);
        human2.c = new Cycle("삼천리", "산악용");
        human2.b = new Bike("빨간", "대림", 180);

        human1.car1.print();
        human1.car2.print();
        human2.c.print();
        human2.b.print();


    }
}
