package mymain.serial;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

import vo.PersonVo;

public class _02_MyMain_Serial2_Open {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InputStream is = new FileInputStream("person.dat");
		
		//객체를 읽는 Stream(역질렬화: 재 조립)
		ObjectInputStream ois = new ObjectInputStream(is);
		
		PersonVo p = (PersonVo) ois.readObject();
		
		System.out.println(p);
		
		ois.close();
		is.close();
	}

}
