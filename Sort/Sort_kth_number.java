import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];//3
        for(int i = 0 ; i < commands.length ; i++){
            int[] num = new int[commands[i][1]- commands[i][0]+1]; //4
            int k  = 0;
            for(int j = commands[i][0]-1 ; j < commands[i][1] ; j++){ //1-5
                num[k] = array[j]; 
                if(k < num.length-1)k++;
            }
            Arrays.sort(num);
            answer[i] = num[commands[i][2]-1];
        }
        return answer;
    }
}