import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> map = new HashMap<>();
        
        //change data structure : array -> hash
       for(String part : participant){
           Integer num = map.getOrDefault(part, 0); //중복을 체크하기 위해 
           // getOrDefault(key, defaultvalue) 해당 key값이 존재 x 
           //  - 해당 key값으로 defaultvalue를 return 
           //  - key값이 존재 ㅇ - 해당 key 값의 value를 return
           map.put(part,++num); // 전위증감 , 후위증감 차이 *****
       }
        
        //find not completion
        for(String comp : completion){
            Integer num = map.get(comp);
             if(num == 1){
                    map.remove(comp);
                    continue;
                }
                map.put(comp, --num);
        }
        answer = map.keySet().iterator().next();
        return answer;

        

    }
}
