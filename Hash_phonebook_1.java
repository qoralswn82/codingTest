
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String min = phone_book[0];
        
         //제일 최소 길이를 갖는 전화번호
        for(String phon : phone_book)if(min.length() > phon.length())min = phon; 
     
        for(String phon: phone_book){
            if(phon.equals(min))continue;
            // else if(phon.contains(min))answer = false; //contains 사용은 접두사 뿐만 아니라 포함되어 있는 경우 모두 허용
            else{
                String comp = phon.substring(0,min.length());
                if(min.equals(comp)) answer = false;
            }
        }

        return answer;
    }
}
