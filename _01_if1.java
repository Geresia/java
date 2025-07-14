package mymain;

import java.util.Random;

public class _01_if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random random = new Random();
		
		int age = random.nextInt(101); // 00 에서 99까지의 램덤한 삶
		
		String result = "";
		
		if(age < 10) 
			result = "촉법소년/소녀 까르륵 아동 보호구역에서 차에 몸통 박치기!";		
		else {if(age>=10 && age < 20)result = "개기는 시대";
		
		if(age>=20 && age < 40)result = "요즘 MZ들은 말이여";

		if(age>=40 && age < 70)result = "나떄는 말이여";

		if(age>=70)result = "아버님 또 새마을 운동 이야기하신다";
		}
		System.out.printf("나이는 [%d](세) [%s]이군요!!\n", age, result);
		
	}

}
