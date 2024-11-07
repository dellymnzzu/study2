package Day18;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class EX1 {
    public static void main(String[] args) throws UnknownHostException, MalformedURLException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("로컬 컴퓨터 이름 : "+address.getHostName());
        System.out.println("로컬 컴퓨터 IP 주소 : "+address.getAddress());
        InetAddress[] all = InetAddress.getAllByName("www.naver.com");
        for(int i = 0; i<all.length;i++){
            System.out.println(all[i]);
        }
        URL starbuks = new URL("https://www.starbucks.co.kr/index.do");
        System.out.println(starbuks.getProtocol());
        System.out.println(starbuks.getPort());
        System.out.println(starbuks.getHost());
        System.out.println(starbuks.getFile());
        System.out.println(starbuks.toExternalForm());
        
        
    }
}
