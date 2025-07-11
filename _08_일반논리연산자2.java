package mymain;

public class _08_일반논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int 컴퓨터개론   = 80;
		int 데이터베이스 = 80;
		int 운영체제     = 50;
		int 네트워크     = 50;
		
		//합격조건
		//1. 각과목별 과락점수를 넘어야합니다(40이상)
		//2. 평균점수가 60점이상
		
		boolean bCondition1 = (컴퓨터개론>=40 && 데이터베이스>=40 && 운영체제>=40 && 네트워크 >=40);
		
		double avg = (컴퓨터개론 + 데이터베이스 + 운영체제 + 네트워크) / 4.0;
		
		boolean bCondition2 = (avg>=60);
		
		if(bCondition1 && bCondition2) {
			System.out.printf("평균 : %.1f(점) 합격입니다\n", avg);
		}else {
			if(bCondition1==false) {
				System.out.println("과목중 과락된 과목이 있습니다 : 불합격");
			}else {
				System.out.println("평균점수가 60점 미만입니다 : 불합격");
			}
		}
		
	}	

}
