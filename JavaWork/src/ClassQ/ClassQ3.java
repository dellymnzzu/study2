package ClassQ;

//자동차
class Car {
    String color;
    String mf;
    int speed;

    Car(String c, String m, int s) {
        color = c;
        mf = m;
        speed = s;

    }


}

// 자전거
class Cycle {
    String name;
    String mf;
    String fc;

    Cycle(String n, String m, String f) {
        name = n;
        mf = m;
        fc = f;
    }
}

// 오토바이
class Bike {
    String name;
    String mf;
    String fc;
    int speed;

    Bike(String n, String m, String f, int s) {  // 생성자는 객체를 생성 할 때마다 한번씩 호출된다
        name = n;
        mf = m;
        fc = f;
        speed = s;
    }


}


// 왜 사람을 다른 클래스로 줘야하냐면 에스파로 생각 했을 때 에스파는 나야 둘이 될 수 없어.
class Person1 {
    String


    void print() {
        System.out.println("사람이 두명 존재합니다. ");
        System.out.println("첫번째 사람은 자동차 두대를 가지고 있습니다.");
        System.out.println("두번째 사람은 자전거와 오토바이를 가지고 있습니다.");
    }

    void printP1(String color, String mf, int speed) {
        System.out.println("첫번째 사람");
        System.out.println("1번차 : " + color + "," + mf + "," + speed);
        System.out.println("2번차 : " + color + "," + mf + "," + speed);

    }

    void printP2(String name, String mf, String fc, int speed) {
        System.out.println("두번재 사람");
        System.out.println(name + " : " + mf + "," + fc);
        System.out.println(name + " : " + mf + "," + speed);
    }

    class Person2 {

    }

    public class ClassQ3 {
        public static void main(String[] args) {
            Car car = new Car();
            Cycle cycle = new Cycle();
            Bike bike = new Bike();
            Person1 person = new Person1();

            person.print();
            person.printP1("검정", "BMW", 240);
            person.printP1("형광", "현대", 180);
            person.printP2("자전거", "삼천리", "산악용");
            person.printP2("자전거", "삼천리", "산악용");


        }
    }
}
