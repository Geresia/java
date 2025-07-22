package myutil;

public class MyArrays {

	//배열을 출력하는 메소드
	//Call By Reference
	public static void display(int [] ar) {
		
		System.out.print("[");
		for(int i = 0;i < ar.length; i++) {
			System.out.printf("%3d",ar[i]);
		}
		System.out.println(" ]");
	} //end:display()
	
	public static void fill(int [] ar, int value) {
		for (int i = 0, len = ar.length; i < len; i++) {
            ar[i] = value;
		}
		/*
		 * ar[0] = value;
		 * ar[1] = value;
		 * ar[2] = value;
		 * ar[3] = value;
		 */
	}
	
	//오름차순거품정렬(Bubble Sort)
	public static void bubble_sort_asc(int[] mr) {
	    for(int i = 0; i < mr.length; i++) {
	        for(int k = 0; k < mr.length - i - 1; k++) {
	            if (mr[k] > mr[k+1]) {
	                int im = mr[k];
	                mr[k] = mr[k+1];
	                mr[k+1] = im;
	            }
	        }
	    }
	}
	//오름차순거품정렬(Bubble Sort)
		public static void bubble_sort_desc(int[] mr) {
		    for(int i = 0; i < mr.length; i++) {
		        for(int k = 0; k < mr.length - i - 1; k++) {
		            if (mr[k] < mr[k+1]) {
		                int im = mr[k];
		                mr[k] = mr[k+1];
		                mr[k+1] = im;
		            }
		        }
		    }
		}	
	
	//오른차순정렬
	public static void sort_asc(int [] mr) {
		
		for(int i=0; i < mr.length-1;i++) { // i <- selection
			
			for(int k=i+1; k<mr.length;k++) {
				//  고정    이동
				if(mr[i] > mr[k]) {
					//교환
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}//end:k
		}//end:i
		
	}
	//내림차순정렬
	public static void sort_desc(int [] mr) {
		
		for(int i=0; i < mr.length-1;i++) { // i <- selection
			
			for(int k=i+1; k<mr.length;k++) {
				//  고정    이동
				if(mr[i] < mr[k]) {
					//교환
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}//end:k
		}//end:i
		
	}
	public static void sort_asc(int [] mr, int beginIndex,int tolndex) {
		
		for(int i=beginIndex; i < tolndex;i++) { // i <- selection
			
			for(int k=i+1; k<tolndex;k++) {
				//  고정    이동
				if(mr[i] > mr[k]) {
					//교환
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}//end:k
		}//end:i
		
	}
	public static void sort_desc(int [] mr, int beginIndex,int tolndex) {
		
		for(int i=beginIndex; i < tolndex;i++) { // i <- selection
			
			for(int k=i+1; k<tolndex;k++) {
				//  고정    이동
				if(mr[i] < mr[k]) {
					//교환
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}//end:k
		}//end:i
		
	}
}
