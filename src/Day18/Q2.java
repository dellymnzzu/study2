//package Day18;
//
//// 클래스 Acoount 만들기
//// 클래스 Custormer 만들기
//// 카운트 해야함
//
//
//class Account{
//    int cnt = 0;
//    int sum = 0;
//    int m = 10000;
//    synchronized void plus(int j){
//        for(int x = 0;sum<500000;x++){  // for문을 돌리면 안된다. 한번 할 때마다 50000원이 될 때까지 돌려진다.
//            System.out.println(j+"번째 성금자 : "+(cnt++)+"번째 ");
//            sum+=m;
//        }
//        System.out.println("성금 총액은 : "+sum);
//
//}
//}
//class Custormer extends Thread{
//    Account a;
//    int j;
//    Custormer(Account a,int j){
//        this.a = a;
//        this.j = j;
//    }
//
//    @Override
//    public void run() {
//        a.plus(j);
//    }
//}
//
//
//
//
//public class Q2 {
//    public static void main(String[] args) {
//        Account a = new Account();
//
//        Custormer a1 = new Custormer(a,1);
//        Custormer a2 = new Custormer(a,2);
//        Custormer a3 = new Custormer(a,3);
//        Custormer a4 = new Custormer(a,4);
//        Custormer a5 = new Custormer(a,5);
//// 일단 스레드5개 만들기
//        a1.start();
//        a2.start();
//        a3.start();
//        a4.start();
//        a5.start();
//    }
//}
