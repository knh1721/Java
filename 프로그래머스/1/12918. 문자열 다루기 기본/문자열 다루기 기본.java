class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(Character.isDigit(c)){
                    answer = true;
                }else {
                    answer = false;
                    break;
                    
                }

            }
        }else{
            answer = false;
        }
        return answer;
    }
}