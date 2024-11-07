package Day18;

class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<=10;i++){
            System.out.println("재미있는 자바 : "+i);
        }
    }
}

public class ExThread1 {
    public static void main(String[] args) {

        ThreadTest t = new ThreadTest();
        t.start();
        for(int i = 1 ; i<=10;i++){
            System.out.println("Main 쓰레드 : "+i);
        }

        //run()을 치지 않고 스타트만 해도 된다.
        // 일정하게 나오지 않는다. 왜냐면 메인문과 run의 인생은 다르기 때문에

    }
}
