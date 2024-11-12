package API;

import com.google.gson.Gson;

public class GsonTest {
    public static void main(String[] args) {
        Address address = new Address("인천","대한민국");
        Person person = new Person("홍길동",30,"ddd@naver.com",address);

        Gson gson = new Gson();
        String json = gson.toJson(person);// 객체 -> json
        System.out.println(json); //json 출력

        Person person1 = gson.fromJson(json,Person.class); // json - > perosn.class
        System.out.println(person1);

    }
}
