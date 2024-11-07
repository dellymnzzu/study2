package Day18;

class ThreadTest2 extends Thread{  // 스레드는 클래스이다. 문제점 : 다중상속이 되지 않는다. 그래서 스레드가 인터페이스를 줘야한다.

    public ThreadTest2(String str){
        setName(str); // 스레드에 setName -> 스레드 이름을 저장
    }

    @Override
    public void run() {
        for(int i = 1;i<=10;i++){
            System.out.println(i+getName());  // 저장했던 스레드 이름 얻어온다.
        }
        System.out.println("끝"+getName());
    }
}

public class ExDoubleThread2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest2 t1 = new ThreadTest2("배우기 쉬운 자바");
        ThreadTest2 t2 = new ThreadTest2("배우기 어려운 자바");
        System.out.println("**********쓰레드 시작 전");
        t1.start();
        t2.start();  // 그냥 시작버튼이라고 생각하면 된다.
        t1.join();
        t2.join();
        System.out.println("***********스레드 시작 후  ");  // 조인을 쓸 시 얘가 가장 마지막에 나온다.
    }
}
