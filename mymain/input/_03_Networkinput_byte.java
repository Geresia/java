package mymain.input;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class _03_Networkinput_byte {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String host = "https://www.naver.com/";
		
		//Uniform Resource Locator
		URL url = new URL(host);
		
		InputStream is = url.openStream();
		
		while(true) {
			
			int ch = is.read();
			
			if(ch==-1)break;
			
			System.out.printf("%c", ch);
		}
	}

}
