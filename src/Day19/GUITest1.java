package Day19;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class GUI1 extends JFrame implements ActionListener {
    private JTextField jtf;
    private JTextArea jta;

    GUI1(){
        JButton jb = new JButton("파일로 저장");  // 버튼이 하나 생기는데 파일로 저장이라는 버튼이 생성된다.
        jtf = new JTextField("파일의 이름을 입력하세요", 20);  // 파일의 제목을 생성하는 객체
        jta = new JTextArea("파일의 내용을 입력하세요", 10,20);  // 파일의 내용을 입력하는 것
        Container ct = getContentPane();  // Jfram Contrainer 추출
        ct.setLayout(new FlowLayout());  // 배치를 FlowLayout() // 배치를 어떻게 할지 정하는 것
        JPanel p1 = new JPanel();  // jFram에 안에 있는 Jpanenel을 생성했다.
        ct.add(jta); // Container에 textArea 생성
        p1.add(jtf); // Panel 안에 파일의 제목을 생성
        p1.add(jb); // panel 안에 버튼도 추가 했다.
        ct.add(p1); // 여기에 뭘 추가한건지 궁금합니당.
        jb.addActionListener(this); // ActionListener 이벤트가 발생하면 들을 수 있다.그래서 오버라이딩 했다.
        //만약 버튼을 클릭하면 actionPerformed로 들어간다.
        // 버튼에 클릭이 일어나면 this 내 안에 있는 리스너 연결
        setTitle("GUI Test1");
        setSize(500,300);
        setVisible(true);  // 보여줄까? 할 때 t면 보여준다
    }
//이벤트 발생시 호출되는 메소드
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String s = jtf.getText();
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(jta.getText());
            fos.close();
            System.out.println(s+"파일 생성되었습니다.");
        }
        catch (Exception exception){

        }

    }
}
public class GUITest1{
    public static void main(String[] args){new GUI1();}
}