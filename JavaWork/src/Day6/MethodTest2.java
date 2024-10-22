package Day6;

public class MethodTest2 {

    static int a = 0; // 메모리에 바로 올라감

    //주고 받고
    static String printHello(String name) {
        a = 10;  // static으로 10을 변경
        return "안녕하세요" + name + "님";

    }

    // 주고 안 받고

    static int sum() {
        int a = 5;
        int b = 20;
        return a + b;
    }

    // 안 주고 받고

    static void outputName(String name) {
        System.out.println("안녕하세요" + name + "님.");
    }

    // 안 주고 안 받고 
    static void printBye() {
        System.out.println("바잉");
    }

    public static void main(String[] args) {
        String result = printHello("홍길동");
        System.out.println(result);
        System.out.println(a); // a에서 10을 바꿨으니까
        System.out.println(sum());
        outputName("홍길동");
        printBye();
    }
}

