package mymain;

import java.util.*;

import vo.PersonVo;

public class _04_ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// PersonVO를 저장관리하는 객체
		List<PersonVo> p_list = new ArrayList<PersonVo>();
		
		p_list.add( new PersonVo("일길동", 21, "서울시 관악구 봉천1동"));
		p_list.add( new PersonVo("이길동", 22, "서울시 관악구 봉천2동"));
		p_list.add( new PersonVo("삼길동", 23, "서울시 관악구 봉천3동"));
		p_list.add( new PersonVo("사길동", 24, "서울시 관악구 봉천4동"));
		p_list.add( new PersonVo("오길동", 25, "서울시 관악구 봉천5동"));
		p_list.add( new PersonVo("이기자", 35, "서울시 관악구 봉천6동"));
		
		System.out.println(p_list);
		
		System.out.println("---[첨자이용]---");
		for(int i = 0 ; i < p_list.size(); i++) {
			
			System.out.println(p_list.get(i));
		}
		
		System.out.println("---[개선 loop]---");
		for(PersonVo p : p_list) {
			if (p.getAge() >= 23) {
				System.out.println(p);
			}
		}
			System.out.println("---[Iterator 이용]---");
			
			Iterator<PersonVo> it = p_list.iterator();
			
			while(it.hasNext()) {
				
				
				PersonVo p = it.next();
				System.out.println(p);
			}
			
			System.out.println("자네 어디 이씨고");
			 
			
				for(PersonVo p : p_list) {
					if (p.getName().charAt(0) == '이') {
						System.out.println(p);
					}
				}
			
			}
			
			
		

}
