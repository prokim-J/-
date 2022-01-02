package Hash;

public class stage2 {
/* 전화번호 목록 (프로그래머스 레벨 2)
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. HashMap을 선언한다.
        // Key String, value Integer
        Map<String, Integer> map = new HashMap<>();
        
        // 2. 모든 전화번호를 HashMap에 넣는다.
        for(int i = 0; i<phone_book.length; i++){
            map.put(phone_book[i], i);
        }        
        // 3. 모든 전화번호의 subString이 HashMap에 존재하는지 확인한다.
        for (int i=0; i<phone_book.length; i++){
            for (int j =0; j<phone_book[i].length(); j++){
                if(map.containsKey(phone_book[i].substring(0, j)))
                    return false;
            }
        }
        return true;
    }
}
 */
}
