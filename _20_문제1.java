package mymain;

import java.util.Scanner;

public class _20_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String mbti;
		String result="";
		String result2="";
		String result3="";
		String result4="";
		result = result + "";
		
		System.out.print("MBTI:");
		mbti = scanner.next().toUpperCase();
		
		// if 또는 switch문을 이용해서 성향의 내용을 작성
		//      0123
//		mbti = "ENFP";
		
		char mbti1 = mbti.charAt(0);
		char mbti2 = mbti.charAt(1);
		char mbti3 = mbti.charAt(2);
		char mbti4 = mbti.charAt(3);
		
		if(mbti1 == 'E'){
			result = ("외향적이고");
		}else if(mbti1 == 'I') {
			result = ("내향적이고");
		}
		if(mbti2 == 'N'){
			result2 = ("직관적이고");
		}else if(mbti2 == 'S') {
			result2 = ("감각적이고");
		}
		if(mbti3 == 'T'){
			result3 = ("T발 C야?");
		}else if(mbti3 == 'F') {
			result3 = ("감정적이고");
		}
		if(mbti4 == 'P'){
			result4 = ("인식적인 사람");
		}else if(mbti4 == 'J') {
			result4 = ("판단인 사람");
		}
		System.out.printf("당신의 MBTI는 %s, %s, %s, %s, %s입니다\n",mbti, result, result2, result3, result4);
		scanner.close();
	}

}
