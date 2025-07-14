package mymain;

import java.util.Scanner;

public class _03_switch1 {
	public static void main(String[] args) {
		
		String fruit;
		String result = "무슨맛?";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("과일명: ");
		
		fruit = scanner.next();
		
		switch(fruit)
		{
			case "수박": result = "시원하다"; break; 
			case "두리안": result = "부드럽다"; break; 
			case "참외": result = "달다"; break; 
			case "딸기": result = "맛있다"; break; 
			case "자두": result = "수분이 많다"; break; 
			default 	: result = "그거 뭔디";
		}
		
		System.out.printf("[%s]는(은) [%s]\n", fruit, result);
		
		scanner.close();
		
	}
}
