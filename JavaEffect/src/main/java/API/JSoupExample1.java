package API;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class JSoupExample1 {
    public static void main(String[] args) throws IOException {
        String url = "https://lifequotes.co.kr/";

        //접속해서 태그를 가져올 수 있다.
                Document document = Jsoup.connect(url).get();
        Elements elements = document.getElementsByClass("slide-entry-title entry-title ");
        ArrayList<String> goodtexts = new ArrayList<>();  // goodtexts라는 어레이리스트를 만들었다.

        for(Element e :elements){  // for문으로 elements에 넣어준다.
            goodtexts.add(e.text());  //
        }
        for(int i = 0;i< goodtexts.size();i++){
            System.out.println(goodtexts.get(i));  //for문으로 goodtexts.get의 i번재를 가져온다.
        }


//        System.out.println(elements.text());
        //하나씩 빼고 싶다면 반복문을 돌릴 수 있다.

    }
}
