package myutil;



	public class MyMath {
		// TODO Auto-generated method stub
		
		//Method Overload 요건 : 호출(인자)정보가 틀려야 함
		
		
		
		public static int max(int a, int b, int c) {
			int AB = (a>=b) ? a : b;
			return (AB>=c) ? AB : c;
		}
		//2수중에 큰수00000
		public static int max(int a, int b) {
			
			return (a>=b) ? a : b;
		}
		
		
		//1~n까지의 합
		public static int hap(int n) {
		    int sum = 0;                 
		    for (int i = 1; i <= n; i++) { 
		        sum += i;                
		    }
		    return sum;                      
		}
		//1~n까지의 m의 배수의 합
			public static int hap(int n, int m) {
				int sum = 0;                 
			    for (int i = 1; i <= n; i++) { 
			        if(i % m == 0) {
			        	sum += i; 
			        }        
			    }
			    return sum;                      
			}
		//1~n까지의 홀수의 합
			public static int odd_hap(int n) {
				int sum = 0;
				for (int i = 1; i <= n; i++) { 
			        if(i % 2 == 1){
			        	sum += i; 
			        }
			              
			    }
			    return sum;                      
			}
			
		//fatorial : 4!= 4*3*2*1
			public static double factorial(int n) {
				double sum = 1;
				for (int i = n; i >= 1; i--) { 
			        sum *= i;
			    }
				return sum;
			}
		//m's n승 
		public static double power(int m, int n) {
			double sum = 1;
			for (int i = 1; i <= n; i++) { 
		        sum *= m;
		    }
			return sum;
			
		}
		//솟수의 합
		public static int prime(int n) {
		    int sum = 0;
		    int j;
		    for (int i = 2; i <= n; i++) {
		        for (j = 2; j * j <= i; j++) {
		            if (i % j == 0) {
		                break;
		            }
		        }
		        if (j * j > i) {
		            sum += i;
		            System.out.println(sum);
		        }
		    }
		    return sum;
		    
		
			
		}
	}
