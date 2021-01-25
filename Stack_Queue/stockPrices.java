import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[0] = 1;
        for(int j = 1 ; j < answer.length ; j++){
            answer[j] = 0; 
        }
        int i = 1 ;
        while(i < prices.length){
            
            int j = i;
            if(prices[j-1] > prices[j]){
                j-=2;
                while(j >= 0){
                    answer[j]+=1;
                    --j;
                }
            }
            else{
                while(j >= 0){
                    answer[j]+=1;
                    --j;
                }
            }
            i++;
        }
        
        return answer;
    }
}