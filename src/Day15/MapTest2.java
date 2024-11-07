package Day15;


import java.util.HashMap;

class C {
    int k;
}

class D {
    String str;
}

public class MapTest2 {
    public static void main(String[] args) {
        // key는 Integer만 되는게 아니라 아무거나 다 된다.
        HashMap<C, D> map = new HashMap<>();
        C c = new C();
        C c1 = new C();
        map.put(c, new D());
        System.out.println(map.get(c1));  //
        System.out.println(map.get(c).str); // c를 만들었지만, str에 뭘 넣은게 없으니 null값이 나온다.

    }
}
