package Hash;

public class stage2 {
/* ��ȭ��ȣ ��� (���α׷��ӽ� ���� 2)
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        // 1. HashMap�� �����Ѵ�.
        // Key String, value Integer
        Map<String, Integer> map = new HashMap<>();
        
        // 2. ��� ��ȭ��ȣ�� HashMap�� �ִ´�.
        for(int i = 0; i<phone_book.length; i++){
            map.put(phone_book[i], i);
        }        
        // 3. ��� ��ȭ��ȣ�� subString�� HashMap�� �����ϴ��� Ȯ���Ѵ�.
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
