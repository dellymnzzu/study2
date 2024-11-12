package Excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//제목 저자,태그
public class ExcelCrawling {
    public static void main(String[] args) throws IOException {
        String url = "https://novel.naver.com/webnovel/weekday";
        Document document = Jsoup.connect(url).get();
        Elements elements = document.select("div.info_area");
//        System.out.println(elements.text());

        int count = 1; //번호
        XSSFWorkbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("웹소설");
        Row headRow = sheet.createRow(0);
        headRow.createCell(0).setCellValue("번호");
        headRow.createCell(1).setCellValue("제목");
        headRow.createCell(2).setCellValue("작성자");
        headRow.createCell(3).setCellValue("곤심수");

        for(Element e : elements) {
            Row r = sheet.createRow(count);
            if (!e.select("span.title").text().equals("") &&
                    !e.select("span.author").text().equals("") &&
                    !e.select("span.count").text().equals("")) {
                r.createCell(0).setCellValue(count++);
                r.createCell(1).setCellValue(e.select("span.title").text());
                r.createCell(2).setCellValue(e.select("span.author").text());
                r.createCell(3).setCellValue(e.select("span.count").text());


//                System.out.println("제목 : "+e.select("span.title").text());
//                System.out.println("저자 : "+e.select("span.author").text());
//                System.out.println("태그 : "+e.select("span.count").text());
            }
        }
        FileOutputStream outputStream = new FileOutputStream(new File("web.xlsx"));
        workbook.write(outputStream);
        workbook.close();

        }

//
//        Elements ranks = document.select(".info_area .rank");
//        Elements titles = document.select(".title_group .title");
//        Elements authors = document.select(".info_area .author");
//
//        // 각 요소의 텍스트 출력
//        for (int i = 0; i < ranks.size(); i++) {
//            String rank = ranks.get(i).text();
//            String title = i < titles.size() ? titles.get(i).text() : "No title";
//            String author = i < authors.size() ? authors.get(i).text() : "No author";
//
//            System.out.println(rank  + title + author);
//        }


    }


