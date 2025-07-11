package mymain;

import java.util.Scanner;

public class _11_3항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor; 
		String grade="F";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어: ");
		kor = scanner.nextInt();
		
		//0~100사이냐? 3/3/4
		if(kor>=0 && kor <=100) {
			
			grade = 
					(kor>=96) ? "A+": 
					(kor>=93) ? "A" : 
					(kor>=90) ? "A-": 
					(kor>=86) ? "B+": 
					(kor>=83) ? "B" : 
					(kor>=80) ? "B-": 
					(kor>=76) ? "C+": 
					(kor>=73) ? "C" : 
					(kor>=70) ? "C-": 
					(kor>=66) ? "D+": 
					(kor>=63) ? "D" : 
					(kor>=60) ? "D-": "F"; 
			
			System.out.printf("이번 수학 성적은 %d점 등급:%s\n", kor, grade);
		}else {
			System.out.println("어이 아들 내가 머저리 빙다리 핫바지로 보이냐?");
		}
		    	
		    
			
		scanner.close();
		
		}}


