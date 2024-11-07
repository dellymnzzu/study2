//package Day15;
//
//class Unit {
//    int price;
//    int hp;
//    int atk;
//    int def;
//    String target;
//    double speed;
//    String type;
//
//    Unit(int price, int hp, int atk, int def, String target, double speed, String type) {
//        this.price = price;
//        this.hp = hp;
//        this.def = def;
//        this.target = target;
//        this.speed = speed;
//        this.type = type;
//
//    }
//}
//
//class Juggling extends Unit {
//    Juggling() {  // 생성자 하나 생성
//        super(50, 35, 5, 0, "지상", 2.612, "지상,소형,생체");
//    } // super는 부모의 메서드나 생성자에 호출 가능
//
//    void print() {
//        System.out.println("저글링의 생산 비용은  미네랄 :" + price + ",체력 :" + hp + ", 공격력 :" + atk + ",방어력 :" + def +
//                " ,공격대상 :" + target + ", 이동속도 :" + speed + ", 유닛 특성 :" + type + "입니다.");
//    }
//}
//
//class Hydra extends Unit {
//    Hydra() {
//        super(100, 80, 10, 0, "지상,공중", 1.741, "지상,중형,생체");
//    }
//
//    void print() {
//        System.out.println("히드라의 생산 비용은  미네랄 :" + price + ",체력 :" + hp + ", 공격력 :" + atk + ",방어력 :" + def +
//                " ,공격대상 :" + target + ", 이동속도 :" + speed + ", 유닛 특성 :" + type + "입니다.");
//    }
//}
//
//class Marine extends Unit {
//    Marine() {
//        super(50, 50, 6, 0, "지상,공중", 1.875, "지상,소형,생체");
//
//    }
//
//    void print() {
//        System.out.println("마린의 생산 비용은  미네랄 :" + price + ",체력 :" + hp + ", 공격력 :" + atk + ",방어력 :" + def +
//                " ,공격대상 :" + target + ", 이동속도 :" + speed + ", 유닛 특성 :" + type + "입니다.");
//
//    }
//}
//
//class Teran {  // 테란 클래스
//    Marine[] m = new Marine[3]; // 마린 3마리 배열로 생성
//    int turn = 0; // 턴 수
//    int attackIndex = 0;
//
//    Teran() {
//        for (int i = 0; i < m.length; i++) {
//            m[i] = new Marine();
//            m[i].print();
//        }
//    }
//
//    Marine AttackM() {  // 공격 할 마린
//        for (int i = 0; i < m.length; i++) {  // 0번째 일 때  ,1일 때
//            int index = (attackIndex + i) % 3; // 현재 턴에 따라 인덱스 결정한다.  , 0번째2번째..?
//            if (m[index] != null) {  // m[0]
//                System.out.println(index + "번째 마린이 공격합니다. "); // 공격하는 마린 출력, 0번째 마린이 공격합니다.
//                attackIndex = (index + 1) % 3;  // 1
//                return m[index]; // 살아있는 마린 반환
//            }
//        }
//        return null;  // 아닐 경우 null 값 넣기
//
//    }
//
//    void DeathM() {  // 마린이 죽었는지 확인 하는 메서드
//        for (int i = 0; i < m.length; i++) {
//            if (m[i] != null && m[i].hp <= 0) { // m[i]번째가 null 값이거나 m[i].hp가 0보다 작거나 같을 경우
//                System.out.println((i + 1) + "번째 마린이 죽었습니다. "); // 마린 쥬금
//                m[i] = null; // 죽은 마린 null 값으로 변경
//            } else if (m[i] != null) {
//                System.out.println((i + 1) + "번째 마린의 남은 hp : " + m[i].hp);
//            }
//        }
//    }
//
//    boolean CheckM() {// 게임 종료 확인
//        for (int i = 0; i < m.length; i++) {
//            if (m[i] != null) {
//                return true; // 마린이 죽지 않았으면 true를 반환
//            }
//        }
//        System.out.println("모든 마린이 죽었습니다.");  // 위에서 모든 마린이 죽었을 경우 출력
//        return false;
//    }
//}
//
//class Zerg {
//    Juggling j;
//    Hydra h;
//
//    int turn = 0;
//
//    Zerg() {
//        j = new Juggling();
//        h = new Hydra();
//        j.print();
//        h.print();
//    }
//
//    void AttackedZ(Marine m) {  // 저그가 공격 당했을 때의 메서드
//        if (j != null) {  // 저글링이 null일 경우
//            System.out.println("저글링이 마린에게 공격을 받았습니다.");
//            j.hp -= m.atk; // 저글링의 체력은 m의 공격력만큼 빼기
//
//            if (j.hp <= 0) {
//                j = null;
//                System.out.println("저글링이 죽었습니다.");
//            }
//        } else if (h != null) {
//            System.out.println("히드라가 마린에게 공격을 받았습니다. ");
//            h.hp -= m.atk;
//            if (h.hp <= 0) {
//                h = null;
//                System.out.println("히드라가 죽었습니다.");
//            }
//        }
//    }
//
//    boolean checkZ() { // 게임 종료 확인
//        if (j != null) {
//            return true;
//
//        }
//        if (h != null) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//}
//
//public class Q2 {
//    public static void main(String[] args) {
//        Teran t = new Teran();
//        Zerg z = new Zerg();
//        boolean check;
//        int cnt = 1;
//
//        while (true) {
//            System.out.println((cnt++) + "턴 저그 공격");
//
//            //저글링이 공격하는 경우
//            if (z.j != null) {
//                System.out.println("저글링이 공격합니다. ");
//                Marine m = t.CheckM();
//            }
//
//        }
//
//    }
//}
