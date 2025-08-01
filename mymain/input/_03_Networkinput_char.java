package mymain.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class _03_Networkinput_char {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String host = "https://www.naver.com/";
		URL url = new URL(host);
		InputStream is = url.openStream();
		
		//Uniform Resource Locator
		
		InputStream isr = url.openStream();
		
		InputStreamReader isr1 = new InputStreamReader(is);
		
		while(true) {
			
			int ch = isr1.read();
		
			
			if(ch==-1)break;
			
			System.out.printf("%c", ch);
		}
	}

}
