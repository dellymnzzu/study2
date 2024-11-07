package Day15;

//<>가 제네릭이다.
class Box<T> {
    T vol;

    void setVolume(T v) {
        vol = v;

    }

    T getVolume() {
        return vol;
    }
}

public class GeenericTest {
    public static void main(String[] args) {
        Box<Integer> ibox = new Box<>(); // T가 int형으로 바뀐다.
        ibox.setVolume(200);
        System.out.println("<Integer>박스의 부피는 : " + ibox.getVolume());
        Box<String> sbox = new Box<>(); // T가 int형으로 바뀐다.
        sbox.setVolume("hello");

        System.out.println(sbox.getVolume());
        Box<Double> dbox = new Box<>();
        dbox.setVolume(50.7);
        System.out.println("<Dobule>박스의 부피는 : " + dbox.getVolume());


    }

}
