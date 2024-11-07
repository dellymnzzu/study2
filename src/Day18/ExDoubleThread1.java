package Day18;

class ThreadTest1 extends Thread{
    public ThreadTest1(String str){
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

public class ExDoubleThread1 {
    public static void main(String[] args) {
        ThreadTest1 t1 = new ThreadTest1("김민주");
        ThreadTest1 t2 = new ThreadTest1("호랑이");

        t1.start();
        t2.start();
        System.out.println("바이~ ");  // 조인을 쓸 시 얘가 가장 마지막에 나온다.

    }
}
