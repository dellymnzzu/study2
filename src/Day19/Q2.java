//package Day19;
//
//// 프레임, 패널, 패인을 담을 수 있는 모든 것을 컨테이너라고 부른다.
//// 프레임 : 탑레벨 컨테이너 (윈도우창 한개 )
//// 패널 : 특별한 기능은 없고 주로 비슷한 녀석들을 묶어서 함께 데리고 다니기 위한 목적
//// 패인 : 패널과 비슷한 구석이 있지만, 좀 더 특별한 기능에 충실한 컨테이너
//// 레이어를 만들어서 특정 레이어를 보였다 안 보였다 하고 싶거나 탭 기능 구현 등 패인을 사용하기
//
//// 5*5 그리드 생성 각 칸에 물고기나 물을 표시하는 JLabel을 넣기
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//class Maze extends JFrame {
//    int[][] list = new int[5][5]; // 미로배열
//    JButton[][] buttons = new JButton[5][5]; // 버튼 배열
//
//    int startY, startX; // 시작점 위치
//    int goalY, goalX; // 목표점 위치
//
//    Maze() {
//        Container ct = getContentPane();
//        ct.setLayout(new BorderLayout());  // BorderLayout 사용
//
//        JTextField statusField = new JTextField("탈출해주세요!");
//        statusField.setHorizontalAlignment(SwingConstants.CENTER);
//        statusField.setEditable(false);  // 텍스트 수정 불가능하도록 설정
//        statusField.setPreferredSize(new Dimension(40, 40)); // 크기 설정 (가로 400, 세로 40)
//        ct.add(statusField, BorderLayout.CENTER); // 중앙에 텍스트 필드 추가
//
//        // 미로 버튼 패널 (5x5 그리드로 버튼 배치)
//        JPanel mazePanel = new JPanel();
//        mazePanel.setLayout(new GridLayout(5, 5, 5, 5));  // 5x5 그리드로 미로 버튼 배치
//
//        Random r = new Random();
//
//        goalY = r.nextInt(5);
//        goalX = r.nextInt(5);
//        list[goalY][goalX] = 1; // 랜덤으로 목표지점 설정
//
//        startY = r.nextInt(5);
//        startX = r.nextInt(5);
//
//        // 목표지점과 시작점이 같은 경우 다시 설정
//        if (list[goalY][goalX] == list[startY][startX]) {
//            startY = r.nextInt(5);
//            startX = r.nextInt(5);
//        }
//        list[startY][startX] = 2; // 시작점 설정
//
//        // 미로 버튼들 배치 및 상태 표시
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list[i].length; j++) {
//                JButton button = new JButton();
//                button.setBackground(Color.decode("#eeeeee"));
//                button.setBorder(BorderFactory.createLineBorder(Color.decode("#d7d7d7")));
//                button.setFocusPainted(false);
//                Dimension size = new Dimension(80, 80); // 버튼 크기 설정
//                button.setPreferredSize(size); // 원하는 크기
//                button.setMaximumSize(size);   // 최대 크기 제한
//                button.setMinimumSize(size);   // 최소 크기 제한
//
//                // 목표지점은 핑크색으로 표시
//                if (list[i][j] == 1) {
//                    button.setBackground(Color.decode("#f36095"));
//                }
//                // 시작점은 파란색으로 표시
//                if (list[i][j] == 2) {
//                    button.setBackground(Color.decode("#719bdd"));
//                }
//
//                // 버튼을 배열에 저장
//                buttons[i][j] = button;
//                mazePanel.add(button); // 미로 버튼을 mazePanel에 추가
//            }
//        }
//
//        // 이동 버튼 패널 (위, 아래, 왼쪽, 오른쪽)
//        JPanel movePanel = new JPanel();
//        movePanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));  // 이동 버튼들을 가로로 배치
//        movePanel.setPreferredSize(new Dimension(400, 60)); // 이동 버튼 영역 크기 설정
//
//        JButton moveUpButton = new JButton("Up");
//        JButton moveDownButton = new JButton("Down");
//        JButton moveLeftButton = new JButton("Left");
//        JButton moveRightButton = new JButton("Right");
//
//        moveUpButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                movePlayer(-1, 0, statusField); // 상으로 이동
//            }
//        });
//
//        moveDownButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                movePlayer(1, 0, statusField); // 하으로 이동
//            }
//        });
//
//        moveLeftButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                movePlayer(0, -1, statusField); // 좌로 이동
//            }
//        });
//
//        moveRightButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                movePlayer(0, 1, statusField); // 우로 이동
//            }
//        });
//
//        movePanel.add(moveUpButton);
//        movePanel.add(moveDownButton);
//        movePanel.add(moveLeftButton);
//        movePanel.add(moveRightButton);
//
//        // 패널을 윈도우에 추가
//        ct.add(mazePanel, BorderLayout.CENTER);  // 미로를 중앙에 배치
//        ct.add(movePanel, BorderLayout.SOUTH);   // 이동 버튼을 하단에 배치
//
//        setTitle("Escape the Maze");
//        setSize(440, 550);  // 창 크기 (버튼 영역 추가로 높이 증가)
//        setVisible(true);
//    }
//
//    // 플레이어 이동 처리
//    private void movePlayer(int dy, int dx, JTextField statusField) {
//        int newY = startY + dy;
//        int newX = startX + dx;
//
//        // 유효한 범위 내에서 이동할 수 있도록 처리
//        if (newY >= 0 && newY < 5 && newX >= 0 && newX < 5) {
//            // 이전 위치 리셋
//            buttons[startY][startX].setBackground(Color.decode("#eeeeee"));
//            // 새로운 위치 업데이트
//            startY = newY;
//            startX = newX;
//            buttons[startY][startX].setBackground(Color.decode("#719bdd"));  // 파란색으로 표시
//
//            // 게임 종료 조건 체크
//            if (startY == goalY && startX == goalX) {
//                JOptionPane.showMessageDialog(this, "You reached the goal!");
//                statusField.setText("You reached the goal!");
//            } else {
//                statusField.setText("Keep moving!");
//            }
//        }
//    }
//}
//
//public class Q2 {
//    public static void main(String[] args) {
//        new Maze();
//    }
//}
//
//
