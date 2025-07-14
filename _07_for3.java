package mymain;

public class _07_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ABCDEF.......XYZ
		for(int i='A'; i<='Z'; i++) {// i = 65 66 67 ... 90
			System.out.printf("%c", i);
			
		}
		
		System.out.println();//줄바꾸기
		
		for(int i=0; i< 26; i++) {// i = 0 1 2 3 ... 25
			System.out.printf("%c", 'A' + i);
			
		}
		System.out.println();//줄바꾸기
		
		//대소대소
		//AbCdEfGhIj
		for(int i='A'; i<='Z'; i++) {// i = 65 66 67 ... 90
			if(i%2 != 0) {
			System.out.printf("%c", i);//대문자
			}else {
			System.out.printf("%c", i + 32);//소문자
			}
		}
		System.out.println();//줄바꾸기
		
		//AbcDefGhiJklM
		//대소소대소소
		for(int i='A'; i<='Z'; i++) {// i = 65 66 67 ... 90
			if(i%3 == 2) {
			System.out.printf("%c", i);//대문자
			}else {
			System.out.printf("%c", i + 32);//소문자
			}
			}
		
		System.out.println();//줄바꾸기
		
		//3자리마다 - 넣기//ABC-DEF-GHI
		for(int i='A'; i<='Z'; i++) {// i = 65 66 67 ... 90
			System.out.printf("%c", i);//대문자
			if(i%3==1){
				System.out.print("-");
			}
			}
		
		System.out.println();//줄바꾸기
		
		// A-B=C~D-E=F~G
		for(int i='A'; i<='Z'; i++) {// i = 65 66 67 ... 90
			System.out.printf("%c", i);//대문자
		if(i != 'Z') {
			if(i%3==2){
				System.out.print("-");
			}else if(i%3==1){
				System.out.print("~");
			}else if(i%3==0){
				System.out.print("=");
			}
		}
		}

	}
}
