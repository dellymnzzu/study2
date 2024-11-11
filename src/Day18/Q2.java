//package Day18;
//
//// 클래스 Acoount 만들기
//// 클래스 Custormer 만들기
//// 카운트 해야함
//
//
//class Account {
//    int cnt = 0;  // 기부자 수
//    int sum = 0;  // 기부 금액 합계
//    int m = 10000;  // 한 번에 기부하는 금액
//
//    // synchronized로 메소드를 동기화하여 여러 스레드가 동시에 실행되지 않도록 함
//    synchronized void plus(int j) {
//        // sum이 5000 이상이 될 때까지 계속 기부자 수를 증가시키고 기부금 합계에 더함
//        while (sum < 50000) {   // 이건 한 사람이 합계가 5만원이 될 때 빠져나간다.
//            // 고객에게 while문을 돌려야한다.
//            System.out.println(j + "번째 성금자 : " + (++cnt) + "번째 ");
//            sum += m;  // 한 번에 10000원 기부
//            if (sum >= 50000) {
//                System.out.println("총 금액 : "+sum);
//                break;  // 5000원을 넘으면 기부 종료
//            }
//        }
//    }
//}
//
//// 고객을 나타내는 클래스 (스레드를 상속받아 각 고객이 기부하는 역할을 수행)
//class Customer extends Thread {
//    Account a;
//    int j;
//
//    Customer(Account a, int j) {
//        this.a = a;
//        this.j = j;
//    }
//
//    @Override
//    public void run() {
//        a.plus(j);  // 기부 작업 실행
//    }
//}
//
//public class Q2 {
//    public static void main(String[] args) {
//        Account a = new Account();  // 기부자들을 위한 Account 객체 생성
//
//        // 각 기부자를 나타내는 스레드 생성
//        Customer c1 = new Customer(a, 1);
//        Customer c2 = new Customer(a, 2);
//        Customer c3 = new Customer(a, 3);
//        Customer c4 = new Customer(a, 4);
//        Customer c5 = new Customer(a, 5);
//
//        // 각 기부자 스레드 시작
//        c1.start();
//        c2.start();
//        c3.start();
//        c4.start();
//        c5.start();
//    }
//}
//
