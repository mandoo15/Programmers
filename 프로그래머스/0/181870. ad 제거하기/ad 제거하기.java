class Solution {
    public String[] solution(String[] strArr) {
        int length = strArr.length;
        for(int i=0; i<strArr.length; i++){
            if(strArr[i].contains("ad")){
                strArr[i] = "";
                length--;
            }
        }
        
        String[] answer = new String[length];
        length = 0;
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].equals("")) {
                answer[length] = strArr[i];
                length++;
            }
        }
        
        return answer;
    }
}