package Day18;


import java.util.Random;

//부스터 인터페이스 아무것도 없다.
interface Booster{}
// 탈 것 - 이동거리 게이지 이동함수
abstract class Vehicle{
    Random r = new Random();
    int distance;
    int gauge;
    abstract void move(int stop,int turn);


}

class Car extends Vehicle implements Booster{
    @Override
    void move(int stop, int turn) {
        gauge = turn %4;

        int move = r.nextInt(21);
        if(stop != 1){
            distance += move;
        }
        gaugePrint(turn);
        distancePrint();
    }

    void gaugePrint(int turn){
        System.out.println("자동차 게이지 : "+gauge+",");

    }
    void distancePrint(){
        System.out.println("자동차의 주행거리 : "+distance);
    }
}

class Cycle extends Vehicle implements Booster{
    @Override
    void move(int stop, int turn) {
        gauge = turn %2;
        int move = r.nextInt(11);
        if(stop != 2){
            distance += move;
        }
        gaugePrint(turn);
        distancePrint();
    }

    void gaugePrint(int turn){
        System.out.println("자전거 게이지 : "+gauge+",");

    }
    void distancePrint(){
        System.out.println("자동차의 주행거리 : "+distance);
    }
}

class Bike extends Vehicle implements Booster{
    @Override
    void move(int stop, int turn) {
        gauge = turn %4;
        int move = r.nextInt(16);
        if(stop != 3){
            distance += move;
        }
        gaugePrint(turn);
        distancePrint();
    }

    void gaugePrint(int turn){
        System.out.println("오토바이 게이지 : "+gauge+",");

    }
    void distancePrint(){
        System.out.println("오토바이의 주행거리 : "+distance);
    }
}
public class Q3_test {
    static void boosterRun(int stop, Booster b){
        if (b instanceof Car){
            if(stop != 1&&((Car) b).gauge==3){
                ((Car) b).distance +=2;
            }

        }
        if(b instanceof Cycle){
            if(stop!=2&&((Cycle) b).gauge==1){
                ((Cycle) b).distance +=5;
            }

        }
        if(b instanceof Bike){
            if(stop !=3&&((Bike) b).gauge==2){
                ((Bike) b).distance+=3;
            }

        }

    }
    public static void main(String[] args) {
        Random r = new Random();
        Car c = new Car();
        Cycle b = new Cycle();
        Bike m = new Bike();
//
//        Vehicle[] v = new Vehicle[3];
//        v[0] = new Car();
//        v[1] = new Cycle();
//        v[2] = new Bike();

        int turn = 0;
        int stop;
        while (true) {
            stop = r.nextInt(3) + 1;
            boosterRun(stop, c);
            boosterRun(stop, b);
            boosterRun(stop, m);

            c.move(stop, turn);
            b.move(stop, turn);
            m.move(stop, turn);

            if (c.distance >= 500 || b.distance >= 500 || m.distance >= 500) {
                break;
            }
            turn++;

        }
        if(c.distance == b.distance ||c.distance == m.distance||b.distance==m.distance){
            System.out.println("공동우승");
        }
        else if(c.distance> b.distance&&c.distance>m.distance){
            System.out.println("자동차 우승");
        }
        else if(b.distance>c.distance&&b.distance>m.distance){
            System.out.println("자전거 우승");
        }
        else{
            System.out.println("오토바이 우승입니다. ");
        }
    }}

