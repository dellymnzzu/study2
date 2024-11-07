package Day8;

class B {
    String name;

    String getName() {
        return name;
    }//이름을 알아내는 도구이다.
}

public class ClassTest3 {
    public static void main(String[] args) {
        B Ahn = new B();
        Ahn.name = "안연수";
        System.out.println(Ahn.name); //안연수
        System.out.println(Ahn.getName()); //안연수
    }
}
