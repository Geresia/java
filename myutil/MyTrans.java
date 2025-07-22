package myutil;

public class MyTrans {

    /** 오른쪽으로 90도 회전 */
	public static int[][] rotate_right_90(int[][] src) {
	    int rows = src.length;       // 원본 행 개수
	    int cols = src[0].length;    // 원본 열 개수
	    int[][] dup = new int[cols][rows];  // 회전 후 행·열 바뀜

	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            // src[i][j] 를 시계 방향으로 90° 회전한 위치에 저장
	            dup[j][rows - 1 - i] = src[i][j];
	        }
	    }
	    return dup;
	}
    
//    public static int[][] rotate_right_180(int[][] src) {
//        int rows = src.length;         // 원본 행 개수
//        int cols = src[0].length;      // 원본 열 개수
//        // 회전 후에는 열 수가 행이 되고, 행 수가 열이 된다
//   
//        int[][] dup = new int[cols][rows];
//
//        for(int i=0; i<rows; i++) {
//            for(int k=0; k<cols; k++) {
//               dup[i][k] = src [k][i];
//            }
//         }
//
//        return dup;
//    }
//    /** 오른쪽으로 270도 회전 */
//    public static int[][] rotate_right_270(int[][] src) {
//        int rows = src.length;         // 원본 행 개수
//        int cols = src[0].length;      // 원본 열 개수
//        // 회전 후에는 열 수가 행이 되고, 행 수가 열이 된다
//        int[][] dup = new int[cols][rows];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                dup[cols - 1 - j][rows - 1 - i] = src[i][j];
//            }
//        }
//
//        return dup;
//    }
}