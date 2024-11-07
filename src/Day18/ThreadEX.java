package Day18;

import org.w3c.dom.ls.LSOutput;

class Buffer{  // 버퍼에 풋이 있고 겟이 있다. 생산하고 소비하고 하는 것을 설명한다.
    private int contents;// 결과물
    private boolean available = false;  // 반복 제어 변수
    public synchronized void put(int value){  // 동기화 해서 하나씩 나오게 한다.
        while (available == true){  //available이 false니까 빠져나온다.
            try{
                wait();  // Thread wait()실행 노티파이 전까지 계속 기다림
            }catch(InterruptedException e){

            }
        }
        contents = value;  // contents에 value의 값을 넣었다.
        System.out.println("생산자##### : 생산 "+contents);
        notify();  // 깨워준다.
        available = true;  // true로 변경해서 wait하게 한다.
    }
    public synchronized int get(){  // 동기화 해서 하나씩 들어가게 한다.
        while (available == false){  // available이 false이기 때문에 기다린다.
            try {
                wait();  //소비자는 처음부터 기다리고 있다.
            }catch (InterruptedException e){

            }

        }
        System.out.println("소비자######## : 소비 "+contents);  // 소비자의 내용을 출력해준다.
        notify();// 스레드가 wait()하고 있는 경우 깨워주는 기능
        available = false;  // available 이 false로 변경되었다.
        return contents; // 끝나게 되면 contents를 리턴해준다.
    }
}

class Producer extends Thread{  // 스레드화 했다.
    private Buffer b;  // has 관계 b 선언
    Producer(Buffer b){this.b = b;}

    @Override
    public void run() {
        for(int i = 1; i<=10;i++){
            b.put(i);
        }
    }
}

class Consumer extends Thread{
    private Buffer b;
    Consumer(Buffer b){this.b = b;}

    @Override
    public void run() {
        int value = 0;
        for(int i = 1; i<=10;i++){
            value = b.get();
        }
    }
}


public class ThreadEX {
    public static void main(String[] args) {
        Buffer b= new Buffer();// 가장 먼저 buffer를 선언
        Producer p = new Producer(b);  // producer에 b를 넣었다.
        Consumer c = new Consumer(b);
        p.start();  // p시작
        c.start(); // c 시작
    }
}
