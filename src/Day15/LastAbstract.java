//package Day15;
//
//
//interface Repairable {
//    // Object 클래스 최상단 부모
//    // 메소드 public String toStrint()
//    //객체 print하면 메모리 주소 값이 나온다.
//    // 왜냐면 Object class 에서  public String toStrint() 정의됨
//    // 하면 재정의
//    String toStrint();
//}
//
//interface Heal {
//}
//
//class Unit1 {
//    int attack;
//    int hitPoint;
//    final int MAX_HP;
//
//    Unit1(int hp, int attack) {
//        MAX_HP = hp;
//        hitPoint = MAX_HP;
//        this.attack = attack;
////    }
//}
//}
//
//abstract class GroundUnit extends Unit1 {
//    GroundUnit(int hp, int attack) {
//        super(hp, attack);
//    }
//
//}
//
//class AirUnit extends Unit1 {
//    AirUnit(int hp, int attack) {
//        super(hp, attack);
//    }
//}
//
//class Tank extends GroundUnit implements Repairable{
//    Tank(){
//        super(150,10);
//    }
//    // Object 클래스 최상단 부모
//    // 메소드 public String toStrint()
//    //객체 print하면 메모리 주소 값이 나온다.
//    // 왜냐면 Object class 에서  public String toStrint() 정의됨
//    // 하면 재정의
//    @Override
//    public String toStrint(){
//        return "Tank";
//    }
//
//}
//class SCV extends GroundUnit implements Repairable,Heal{
//    SCV(){
//        super(60,5);
//    }
//    void repair(Repairable r){
//        if(r instanceof Unit1){
//            Unit1 u = (Unit1) r;
//            if(u!=null&&u.MAX_HP!=u.hitPoint){
//                System.out.println(u+"에너지 1증가");
//                u.hitPoint++;
//            }
//        }
//    }
//    class Marine1 extends GroundUnit implements Heal{
//        Marine1{
//            super(40,6);
//        }
//    }
//    class Madic extends GroundUnit implements Heal{
//        Madic(){
//            super(80,0)
//        }
//        void Heal(Heal h){
//            if(h instanceof Unit1){
//                Unit1 u = (Unit1) h;
//                if(u!=null &&u.MAX_HP != u.hitPoint){
//                    u.hitPoint+=2;
//                }
//            }
//        }
//    }
//
//
//    @Override
//    public String toStrint() {
//        return "";
//    }
//}
//
//public class LastAbstract {
//    public static void main(String[] args) {
//        Tank t =new Tank();
//        Marine1 m = new Marine1();
//        SCV scv - new SCV();
//
//
//    }
//}
