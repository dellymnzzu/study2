package API;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) throws IOException {
        String url = "https://sports.news.naver.com/index";

        Document document = Jsoup.connect(url).get();
        //Elements elements = document.select(".today_list .title");
        Elements elements = document.select("div > strong.title");
        //select(괄호 안)의 조건에 해당하는 <태그>를 모두 추출
        ArrayList<String> titletexts = new ArrayList<>();
        //elements에 있는 각 제목을 하나씩 꺼내서 text(글자) 부분만 titletexts 상자에 넣는다
        for(Element e : elements){
            titletexts.add(e.text());
        }

        //상자안에 있는 모든 제목들을 하나씩 꺼내서 화면에 보여준다.
        for(int i = 0; i<titletexts.size();i++){
            System.out.println(titletexts.get(i));
        }
    }
}
