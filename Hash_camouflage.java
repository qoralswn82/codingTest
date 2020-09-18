import java.util.HashMap;
import java.util.Map.Entry;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        //make hashmap - key : 종류 value : 갯수
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < clothes.length; i++) {
	            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
	        }
        
       for (Entry<String, Integer> entry : map.entrySet()) {
			answer *= entry.getValue() + 1; // 1은 뽑지 않는 경우를 의미
		}
        
        return answer-1;
    }
}

//combination
//집합 = 종류
//ex) 3개의 원소를 갖는 집합에서 (각 원소를 뽑는 경우의 수=종류의 갯수 3) + (뽑지 않는 경우 1) = 집합의 총 조합 4
//ex) 종류가 2개일 경우 각 집합에 대한 조합의 수를 구하고 동시에 집합끼리의 조합은 동시에 발생하므로 *
