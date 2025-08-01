package mymain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList : 동적배열
		//			   순서가 있는 자료구조
		//			   중복허용된다
		//		interface	=	new 클래스()
		//		설명서				설계서
		List<String> sido_list = new ArrayList<String>();
		
		System.out.println(sido_list.size());
		
		sido_list.add("Seoul");
		sido_list.add("busan");
		sido_list.add("jeju");
		sido_list.add("nojamcity");
		sido_list.add("광주");
		sido_list.add("대구");
		
		System.out.println(sido_list.size());
		
		sido_list.set(1,  "경기도");
		
		
		
		System.out.println(sido_list);
		
		for(int i=0;i<sido_list.size();i++) { // i = 0 1 2 3 4 5
			System.out.printf("sido_list's %d번째 요소 : %s\n",
											i, sido_list.get(i)
					);
		}

		
		sido_list.remove(4);
		
		System.out.println("---[첨자를 이용한 요소 추출]---");
		
		for(int i=0;i<sido_list.size();i++) { // i = 0 1 2 3 4 5
			System.out.printf("sido_list's %d번째 요소 : %s\n",
											i, sido_list.get(i)
					);
		}
		
		System.out.println(sido_list);
		System.out.println("---[개선 loop]---");
		for(String sido : sido_list) {
			System.out.printf("%5s" ,sido);
		}
		System.out.println();
		
		System.out.println("---[Iterator를 이용]---");
		
		Iterator<String> it = sido_list.iterator ();
		
		while(it.hasNext()) {
		
			String sido = it.next();
			
			System.out.printf("%5s",sido);
		
	}

	}

}
