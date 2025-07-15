package mymain;
import java.io.FileReader;

public class _10_while3_file {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		
		//화일열기
		FileReader fr = new FileReader("src/mymain/data.txt");
		
		int ch;
		int alpha_upper_count = 0;  // 대문자 개수
		int alpha_lower_count = 0;  // 소문자 개수
		int number_count      = 0;  // 숫자 문자 개수
		int white_count       = 0;  // 눈에 보이지 않는 공백 문자 개수
		int etc_count      	  = 0;  // 나머지 카운트
		int hankuk_count      = 0;  // 눈에 보이지 않는 공백 문자 개수
		
		while(true) {
			
			ch = fr.read(); //fr위치의 문자 1개를 읽어 온다
			
			//화일의 끝(EOF: -1)이면 빠져나와라
			if(ch==-1) break;
			
			System.out.printf("%c", ch);
			
//			Thread.sleep(1000);
			if (ch>='A' && ch<='Z') {
		        alpha_upper_count++;
		    } else if (ch>='a' && ch<='z') {
		        alpha_lower_count++;
		    } else if (ch>='0' && ch<='9') {
		        number_count++;
		    } else if (Character.isWhitespace(ch)) {
		        white_count++; 
		    } else if (ch>= 0xAC00 && ch<= 0xD7A3) {
		    	hankuk_count++;
		    } else { 
		    	etc_count++;
		    }
		}//end:while
		System.out.printf(
			    "\n대문자: %d개, 소문자: %d개, 숫자: %d개, 한글: %d개 공백류: %d개, 나머지 %d개\n",
			    alpha_upper_count, alpha_lower_count, number_count, hankuk_count, white_count, etc_count
			);
		
		//화일닫기
		fr.close();
	}

}
