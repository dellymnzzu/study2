package API;

import com.google.gson.Gson;
import com.google.gson.internal.bind.util.ISO8601Utils;

public class GsonToJson {
    public static void main(String[] args) {
        Member mvc = new Member("홍길동",30,"s@naver.com");
        Gson gson = new Gson();
        String json = gson.toJson(mvc);  //Member 객체 - > Json
        System.out.println(json);
        Member member = gson.fromJson(json,Member.class);  // Json - > Member객체
        System.out.println(member);

    }


}
