package MyMain;

import myutil.고등학생;
import myutil.중학생;
import myutil.초등학생;
import myutil.학생;

public class MyMain_학생 {
	
	static void 어머님왈(학생 [] student_array) {
		for(학생 student : student_array) {
			student.공부한다();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		학생 student = new 학생();
		
//		학생 st1 = new 초등학생();
//		학생 st2 = new 중학생();
//		학생 st3 = new 고등학생();
		
		
		학생 [] student_array = {new 초등학생(), 
								   new 중학생(), 
								 new 고등학생()
								 };
		어머님왈(student_array);
		
	}

}
