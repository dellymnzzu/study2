package Day12;


class C {
    C() {

        System.out.println("C 생성");
    }
}

class D extends C {
    D() {
        System.out.println("D 생성");
    }

}

public class Testinheriatance {
    public static void main(String[] args) {
        D d = new D();  // 오버 로딩은 부모 먼저 호출 후 자식 생성
    }
}
