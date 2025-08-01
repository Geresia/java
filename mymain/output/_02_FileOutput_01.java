package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class _02_FileOutput_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OutputStream os = new FileOutputStream("data.txt");
		
		os.write(65);
		
		os.write('B');
		os.write('1');
		
		os.write('\n');
		
		String msg = "안녕하세요";
		
		byte[] bytes_msg = msg.getBytes();
		
		os.write(bytes_msg);
		
		//닫기
		os.close();
	}

}
