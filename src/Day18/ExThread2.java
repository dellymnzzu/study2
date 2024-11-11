package Day18;

class A{
    synchronized void plus(int i){  // 임계영역 메소드
        for(int j = 0;j<5;j++){
            System.out.println(j*i);
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    A a;
    int i;
    B(A a,int i){
        this.a = a;
        this.i = i;
    }

    @Override
    public void run() {  // 종업원 기능
        a.plus(i); // A 객체 플러스 메소드 호출 -> 플러스 메소드 sychronized 입니다.
        // 한번에 한 스레드만 접근이 가능해진다.
    }
}

public class ExThread2 {
    public static void main(String[] args) {
        A a = new A();
        B b1 = new B(a,3);  // 동시접근을 하려면 같은 객체를 써야한다.
        B b2 = new B(a,7);
        b1.start();
        b2.start();


    }
}
