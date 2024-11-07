package Day17;


// 모든건 interface로 된다.
interface Mynumber {
    int getMax(int num1, int num2);
}

public class IamdaTest {
    public static void main(String[] args) {
        Mynumber max = (x, y) -> (x >= y) ? x : y;  // 오버라이딩 되어있어서 사용이 가능하다. 따라서 맥스가 사용가능하다.
        System.out.println(max.getMax(10, 20));
        /*
         * JavaScript에서 많이 사용하는 패턴
         * Java는 최소 interface를 통해 메소드 선언이 되어 있어야 합니다.
         * int max = (a)->{
         * return a;
         * }
         * */
    }
}
