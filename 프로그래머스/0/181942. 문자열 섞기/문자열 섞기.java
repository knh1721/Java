class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        if(str1.length() <= str2.length()){
            for(int i = 0; i < str1.length(); i++){
                sb.append(str1.charAt(i));
                sb.append(str2.charAt(i));
            }
        }
            
        answer = sb.toString();
        return answer;
    }
}