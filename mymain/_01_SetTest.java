package mymain;

import java.util.HashSet;
import java.util.Set;

public class _01_SetTest {
    public static void main(String[] args) {
        // 모든 Object 타입을 저장하도록
        Set<Object> set = new HashSet<>();

        // Integer 예시
        Integer i0b  = 20;
        Integer i0b1 = 1;

        int    n = i0b1.intValue();
        double d = i0b1.doubleValue();
        float  f = i0b1.floatValue();

        set.add(i0b);          // Integer
        set.add(i0b1);         // Integer
        set.add(25);           // auto-boxing → Integer
        set.add(5);
        set.add(15);
        set.add("아무거나");   // String
        set.add(10.5);         // auto-boxing → Double
        set.add(true);         // auto-boxing → Boolean

        // 팩토리 메서드 예시 (오타 수정)
        Double.valueOf(10.5);
        Boolean.valueOf(true);

        System.out.println(set);
    }
}
