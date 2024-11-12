package PDF;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Year;
import java.util.HashMap;

public class PDFTEST1 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> bookInfo = new HashMap<>();

        bookInfo.put("title","한글자바");
        bookInfo.put("ahthor","홍길동");
        bookInfo.put("publisher","한글 출판사");
        // String.valueOf(year.now().getValue()) 현재 년에 대한 데이터를 문자열로 변경
        bookInfo.put("year",String.valueOf(Year.now().getValue()));
        bookInfo.put("price","25000");
        bookInfo.put("pages","400");

        /*
        * PDF API (iText)
        * pdfWriter -> pdfDocument -> Document
        * Document에 데이터를 추가하기 위해서는 Paragraph*/

        //book.pdf FileOutputStream 객체를 생성 -> pdfWriter 객체를 생성
        PdfWriter writer = new PdfWriter(new FileOutputStream("book.pdf"));
        //PdfWriter - >? PdfDocument 객체를 생성
        PdfDocument pdf = new PdfDocument(writer);
        // PdfDocument -> Document
        Document document = new Document(pdf);
        // Font 설정 : PdfFontFactory 폰트 객체를 생성 폰트 파일, 인코딩 값을 넣어 객체를 생성
        //font 설정하기 위해서
        PdfFont font = PdfFontFactory.createFont("나눔손글씨 나는 이겨낸다.ttf", PdfEncodings.IDENTITY_H);
        //Document font에 위에서 객체 생성 PdfFont를 세팅한다.
        document.setFont(font);
        for(String key : bookInfo.keySet()){
            //Key->Value를 추출해서 Paragraph 객체 생성시 매개변수로 대입한다.
            //"title : 한글 자바"로 값이 들어간다.
            // 왜 이렇게 써질까? 키에 순서가 없기 때문에 래덤값으로 간다.
            Paragraph paragraph = new Paragraph(key+":"+bookInfo.get(key));

            //Paragraph 객체를 Document에 추가
            document.add(paragraph);
        }
        //Document 종료
        document.close();
        System.out.println("pdf 파일이 생성되었습니다.");



    }
}