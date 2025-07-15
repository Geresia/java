package mymain;

import java.io.IOException;

public class _09_while2_keyboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int ch;
		int count = 0;
		int alpha_upper_count 	= 0 ; //대문자 갯수
		int alpha_lower_count 	= 0 ; //소문자 갯수
		int number_count      	= 0 ; //숫자 문자
		int white_count       	= 0 ; //눈에 안보이는 문자 공백, \r \n \t
		int etc_count			= 0 ; //기타문자
		
 		
		System.out.println("종료하려면 Ctrl+Z 누르세요");
		// 무한 loop
		while(true) {
			
			//키보드 버퍼로부터 1byte씩 읽어온다
			ch = System.in.read();
			
			if(ch==-1)break;//while문을 끝내라(탈출)
			
			System.out.printf("%c", ch);
			
			if (ch>='A' && ch<='Z') {
		        alpha_upper_count++;
		    } else if (ch>='a' && ch<='z') {
		        alpha_lower_count++;
		    } else if (ch>='0' && ch<='9') {
		        number_count++;
		    } else if (Character.isWhitespace(ch)) {
		        white_count++; 
		    } else {
		    	etc_count++;
		    }
		}
		
		System.out.println("\n--End--");
		System.out.printf(
			    "대문자: %d개, 소문자: %d개, 숫자: %d개, 공백류: %d개, 나머지 %d개\n",
			    alpha_upper_count, alpha_lower_count, number_count, white_count, etc_count
			);

		}
	}
