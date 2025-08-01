package mymain;

import java.util.*;

public class _07_문제1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("갯수: ");
        int n = scanner.nextInt();
        scanner.nextLine();               // 개행 버리기
        
        System.out.print("값: ");
        String s = scanner.nextLine()
                          .replace(" ", "");  // "5 3 4 2" → "5342"
        scanner.close();
        
        // (키: 순번, 값: 문자) 
        Map<Integer, Character> map = new LinkedHashMap<>();
        int nextKey = 0;
        for (char c : s.toCharArray()) {
            map.put(nextKey++, c);
        }
        
        // 2)1이 될 때까지 반복
        while (map.size() > 1) {
            Iterator<Map.Entry<Integer, Character>> it = map.entrySet().iterator();
            
            // 첫 번째 문자 제거
            if (it.hasNext()) {
                it.next();
                it.remove();
            }
            
            // 2-2) 두 번째 문자를 꺼내서 맵의 뒤(새 키)에 다시 추가
            if (it.hasNext()) {
                Map.Entry<Integer, Character> entry = it.next();
                char ch = entry.getValue();
                it.remove();
                map.put(nextKey++, ch);
            }
        }
        
        // 3) 남은 한 문자 출력
        char result = map.values().iterator().next();
        System.out.println("마지막 남은 문자: " + result);
    }
}
