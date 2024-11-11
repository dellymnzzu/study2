//package Day18;
//
//class Account{
//    private int total = 0;  // total은 총금액이다.
//
//    public int getTotal() {  // 게터만 출력하면 된다.굳이 출력까지 하지 않아도 된다.
//        return total;
//    }
//
//    synchronized void deposit(){  // 동기화로 동기화를 하지 않으면 여러개가 한번에 사용될 수 있기 때문에
//        // 동기화를 시켜 잠궈줘야한다. 동기화 메서드로 사용했다.
//
//        total +=1000; // 총 금액에서 1000원씩 입금을 하기 때문에
//
//    }
//}
//class Customer extends Thread{
//    // has 관계로 account를 가져야 한다.
//    Account a;
//    Customer(Account a, int i){
//        this.a = a;
//
//
//    }
//
//}
//
//public class QQ2 {
//    public static void main(String[] args) throws InterruptedException {
//        Account a = new Account(); // account 객체 생성
//        Customer[] c = new Customer[5];  // 고객 배열 생성
//
//        for(int i = 0; i<5;i++){
//            c[i] = new Customer(a,i+1);  //
//        } // 객체 생성
//
//        for(int i = 0; i<5;i++){
//            c[i].start();  // c의 i번째부터 시작한다.
//        }
//        for(int i = 0; i<5;i++){
//            c[i].join(); // 조인을 하게 되면 아래에 있는 코드가 나중에 실행된다.
//        }
//
//
//    }
//}
