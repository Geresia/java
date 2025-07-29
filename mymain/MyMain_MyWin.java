package mymain;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

// AWT(Abstract Window Toolikt) : 윈도우관련기능 정의
// Frame   		<- awt
// ㄴJFrame		<- swing



public class MyMain_MyWin extends JFrame{

	//화면해상도를 저장할 변수
	int screen_w;
	int screen_h;
	
	
	
	//기본생성자(초기화용도)
	public MyMain_MyWin() {
		
		super("내가 처음 만든 윈도우"); // JFrame("") call
		
		//화면 해상도 구하기
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		screen_w = d.width;
		screen_h = d.height;
		
		System.out.printf("W : %d H : %d\n", screen_w, screen_h);
		
		//위치지정			x   y
		super.setLocation(300, 200);
		
		//크기지정      w   h
		super.setSize(500, 500);
		
		//보여주기
		super.setVisible(true);
		
		//크기변경불가
		super.setResizable(false);
		
		//종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//키보드 이벤트 설정
		//Delegation Event model(위임 이벤트 모델)
		this.addKeyListener(new MykeyAdapter());
		
	}
	
	//키보드 처리 이벤트
	class MykeyAdapter extends KeyAdapter{
		//키가 눌렸을떄 발생하는 메소드
		@Override
		public void keyPressed(KeyEvent e) {
			
			//눌린키값
			int key = e.getKeyCode();
			
			System.out.println();
			
			//현재윈도우의 위치 알아보기
			Point pt = getLocation();
			
			int gan = 50;
			if(key==KeyEvent.VK_LEFT) { //Left
				
				pt.x -= gan;
				
			}else if (key==KeyEvent.VK_UP) { //UP
				
				pt.y -= gan;
				
			}else if (key==KeyEvent.VK_RIGHT) { //Right
				
				pt.x += gan;
				
			}else if (key==KeyEvent.VK_DOWN) { //Down
				
				pt.y += gan;
				
			}
			
			//상하좌우 벗어났냐? 체크
			
			if(pt.x >= 2500) {
				pt.x = -500;
			} else if(pt.y > 1581) {
				pt.y = -500;
			} else if(pt.x < -501) {
				pt.x = 2499;
			} else if(pt.y < -501) {
				pt.y = 1580;
			}
			
			//위치지정
			setLocation(pt);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_MyWin();
	}

}
