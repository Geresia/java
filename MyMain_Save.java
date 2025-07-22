package mymain;

import myutil.Save;

public class MyMain_Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Save [] s_array = {
				new Save("일길동", 1000000),
				new Save("이길동", 2000000),
				new Save("삼길동", 3000000)
				
		};
		
		s_array[0].rate = 0.1;
		
		System.out.println("--[첨자를 이용한 for문]--");
		for(int i=0; i<s_array.length;i++) {
			s_array[i].display();
		}
		
		s_array[0].rate = 0.3;
		
		System.out.println("--[개선 loop방식]--");
		for(Save s : s_array) {
			s.display();
		}
		
		int [] nr = {1,2,3,4,5};
		for(int n : nr) {
			System.out.println(n);
		}
	}

}
