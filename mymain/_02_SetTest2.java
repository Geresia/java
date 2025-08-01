package mymain;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;


public class _02_SetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generic : 객체생성시 저장타입을 지정
		
		//Integer Type만 저장관리
//		Set<Integer> lottoSet = new TreeSet<Integer>();
		
		//String Type만 저장관리
		Set<String> fruitSet = new HashSet<String>();
		fruitSet.add("사과");
		fruitSet.add("딸기");
		fruitSet.add("배");
		fruitSet.add("메론");
		
		System.out.println(fruitSet);
		
		Set<Integer> lottoSet = new TreeSet<Integer>();
		Random random = new Random();
		
		int n = 6;
		while(n>0) { // n = 6 5 4 3 2 1
			
			int no = random.nextInt(45) + 1;
			
			if(lottoSet.add(no)==false)continue;
			
			n--;
		}
		
		System.out.println(lottoSet);
		
		//개선 loop이용한 요소 추출
		System.out.println("---[개선 loop]---");
		
		//for(변수 : 배열 또는 컬렉션 또는 Map)
		
		for(Integer no : lottoSet) {
			System.out.printf("%3d", no);
		}
		
		System.out.println(); //줄바꾸기
		
		//Iterator를 이용한 요소 추출
		System.out.println("---[Iterator 이용]---");
		Iterator<Integer> it = lottoSet.iterator();
		while(it.hasNext()) {//요소를 가지고 있냐?
			Integer no = it.next(); //가져온후 다음으로 이동
			System.out.printf("%3d", no);
			
		}  
	}

}
