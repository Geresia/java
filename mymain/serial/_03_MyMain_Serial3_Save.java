package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _03_MyMain_Serial3_Save {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		PersonVo [] p_array = {
				new PersonVo("일길동", 31, "서울시 관악구 남부순환로 1"),
				new PersonVo("이길동", 32, "서울시 관악구 남부순환로 2"),
				new PersonVo("삼길동", 33, "서울시 관악구 남부순환로 3"),
				new PersonVo("사길동", 34, "서울시 관악구 남부순환로 4"),
				new PersonVo("오길동", 35, "서울시 관악구 남부순환로 5"),
		};
		
		//열기
		OutputStream os = new FileOutputStream("person_array.dat");
		
		//객체 저장하는 Stream
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		//객체저장(직렬화:객체정보를 분해해서 저장처리)
		oos.writeObject(p_array);
				
		//닫기(역순)
		oos.close();
		os.close();
		
		
	}

}
