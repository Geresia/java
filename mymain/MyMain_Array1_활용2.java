package mymain;

import java.util.Calendar;
import java.util.Scanner;

public class MyMain_Array1_활용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		int age;
		
		
		String banimal[] = {"원숭이","닭","개","돼지","쥐","소","범","토끼","용","뱀","말","양"};
		String gan_list[] = {"경","신","임","계","갑","을","병","정","무","기"};
		String ji_list[] = {"신","유","술","해","자","축","인","묘","진","사","오","미"};
		String color_list [] = {"백", "백", "흑", "흑", "청", "청", "적", "적", "황금", "황금"};
		
		String gan;
		String ji;
		String color;
		String tti;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출생년도:");
		year = scanner.nextInt();
		int t = year % 12;
		int g = year % 10;
		Calendar now = Calendar.getInstance();
		int current_year = now.get(Calendar.YEAR);
		int current_month = now.get(Calendar.MONTH);
		age = current_year - year + 1;
		
		tti = banimal[t];
		gan = gan_list[g];
		ji = ji_list[t];
		color = color_list[g];		
		
		System.out.printf("당신은 %d살 %s%s띠 %s%s년입니다", age, color, tti, gan, ji);
		
		//나이 = 현재년도-출생년도 
		
		
				
		
		scanner.close();
	}
}
