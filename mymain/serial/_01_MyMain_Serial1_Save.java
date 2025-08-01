package mymain.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;

public class _01_MyMain_Serial1_Save {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		PersonVo p1 = new PersonVo("홍길동", 30, "서울시 관악구 남부순환로 123");
		//System.out.println(p1);
		
		//열기
		OutputStream os = new FileOutputStream("person.dat");
		
		//객체 저장하는 Stream
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		//객체저장(직렬화:객체정보를 분해해서 저장처리)
		oos.writeObject(p1);
				
		//닫기(역순)
		oos.close();
		os.close();
		
		
	}

}
