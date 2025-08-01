package mymain;

import java.util.Map;
import java.util.TreeMap;

public class _06_MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 단어장 용도의 맵
		// key = word value = "뜻"
		// key = one  value = "하나란 뜻입니다"
		
		Map<String, String> sport = new TreeMap<String, String>();
		
		sport.put("야구", "baseball");
		sport.put("축구", "Soccer");
		sport.put("배구", "Volleyball");
		sport.put("족구", "foot Volleyball");
		sport.put("피구", "Dodgeball");
		
		System.out.println(sport);
		
		String exam = "야구";
		String hankukmal = sport.get(exam);
		System.out.printf("이번 시험범휘 %s의 한국말은 = %s\n", exam, hankukmal);
		
	}

}
