
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String min = phone_book[0];
        
         //제일 최소 길이를 갖는 전화번호
        for(String phon : phone_book)if(min.length() > phon.length())min = phon; 
     
        //제일 최소의 길이를 갖는 전화번호 길이만큼 자른 후 비교
        for(String phon: phone_book){
            if(phon.equals(min))continue;
            // else if(phon.contains(min))answer = false; //contains 사용은 접두사 뿐만 아니라 포함되어 있는 경우 모두 허용
            else{
                String comp = phon.substring(0,min.length());
                if(min.equals(comp)) answer = false;
                
                //startswwith사용
               // if(comp.startsWith(min))answer = false;
            }
        }

        return answer;
    }
}
//추가적인 사항
// + startswith을 사용하여 문자열의 접두사 포함 유무를 알 수 있다.

// compare
// I
// + 최소 길이만큼 substring
// + 비교
// Another one
// + startswith 사용
