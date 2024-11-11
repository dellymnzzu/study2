package Day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI2 extends JFrame implements ActionListener{
    JLabel jl;
    GUI2(){
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        // 화면 배치를 flowLayout으로 설정
        // 레이아웃 매니저중 하나로, 컴포넌트들을 왼쪽에서 오른쪽으로 순서대로 배치한다.
        //화면 크기가 변경되면 컴포넌트들은 다음 줄로 넘겨서 자연스럽게 다시 배치된다.
        JButton j1 = new JButton("1");  // 버튼 1
        JButton j2 = new JButton("2"); // 버튼 2
        jl = new JLabel("안녕!"); // 라벨 글자 안녕!
        ct.add(j1); // 컨테이너에 버튼 1 추가
        ct.add(j2); // 컨테이너에 버튼 2 추가
        ct.add(jl); // 컨테이너에 라벨 추가

        // 컨테이너 만들었다.
        j1.addActionListener(this); // 리스너 설정
        j2.addActionListener(this); // 리스너 설정
        // 액션 오버라이딩
        setTitle("GUI Test2"); // 타이틀
        setSize(500,500); //GUI크기
        setVisible(true); // 보여주기 true
    }

    //이벤트 발생시 동작하는 리스너 오버라이딩 (버튼 1을 눌렀는지 2를 눌렀는지 알 수 있다. )
    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();  // 뭐가 눌렸는지 알 수 있다. (1번 버튼이 눌리면 input에 1이 들어간다. )
        String result = "안녕!"+input;
        jl.setText(result);  // 자바라벨
        System.out.println(input);
    }
}

public class GUITest2 {
    public static void main(String[] args) { new GUI2();

    }

}
