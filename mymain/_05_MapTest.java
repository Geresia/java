package mymain;

import java.util.*;

public class _05_MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer, String> telMap = new TreeMap<Integer, String>();

		telMap.put(Integer.valueOf(1), "010-111-1234");
		telMap.put(2, "010-222-1234");//KLey: Auto-Boxing되어서 들어간다
		telMap.put(3, "010-333-1234");//KLey: Auto-Boxing되어서 들어간다
		telMap.put(4, "010-444-1234");//KLey: Auto-Boxing되어서 들어간다
		telMap.put(5, "010-555-1234");//KLey: Auto-Boxing되어서 들어간다
		
		telMap.put(1, "010-000-1234");//KLey: Auto-Boxing되어서 들어간다
		System.out.println(telMap);
		
		int short_num = 3;
		String result_tel = telMap.get(short_num);
		System.out.printf("단축번호 %d = %s\n", short_num, result_tel);
		
		//전체정보를 조회
		//Map으로부터 Key의 집합(Set)을 얻어온다
		Set<Integer> keySet = telMap.keySet();
		
		System.out.println(keySet);
		
		System.out.println("---[Map 전체정보]---");
		for(Integer key : keySet) {
			
			String value = telMap.get(key);
			
			System.out.printf("단축번호 %d = %s\n", key, value);
		}
		
		
	}

}
