package mymain.output;

import java.io.IOException;
import java.io.OutputStream;

public class _01_MonitorOuput_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//표준출력장치 : System.out <- PrintStream <- OutputStream
		OutputStream os = System.out;
		
		//출력버퍼에 기록
		os.write(65);
		
		os.write('B');
		
		os.write('1');
		
		String msg = "안녕하세요";
		byte [] bytes_msg = msg.getBytes();
		
		os.write(bytes_msg);
		
		double ki = 180.5;
		
		String strKi = String.valueOf(ki);
		os.write(strKi.getBytes());
		//출력버퍼를 비우기->버퍼내용이 화면으로 전송
		
		
		
		
		os.flush();

	}

}
