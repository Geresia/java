package mymain;

import myutil.MyArrays2;
import myutil.MyTrans;

public class MyMain_Array2_문제1 {

    public static void main(String[] args) {
        int[][] src = new int[5][5];
        MyArrays2.set(src);

        System.out.println("---[src]---");
        MyArrays2.display(src);

        System.out.println("---[rotate right 90]---");
        int[][] result = MyTrans.rotate_right_90(src);
        MyArrays2.display(result);  // 수정: 이 결과를 출력한다
        
        
        
        System.out.println("---[rotate right 180]---");
        int[][] result180 = MyTrans.rotate_right_90(result);
        MyArrays2.display(result180);  // 수정: 이 결과를 출력한다
        
        System.out.println("---[rotate right 270]---");
        int[][] result270 = MyTrans.rotate_right_90(result180);
        MyArrays2.display(result270);  // 수정: 이 결과를 출력한다
    }
}