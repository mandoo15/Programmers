class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){ // ASCII코드 변환
            char x = s.charAt(i);
            arr[i] = Character.valueOf(x);
        }
        
        for(int i=0; i<arr.length; i++){ // 내림차순 정렬
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        for(int i=0; i<arr.length; i++){ // 알파벳 변환 및 문자열 만들기
            char ch = (char)arr[i]; 
            answer = answer + Character.toString(ch);

        }
        return answer;
    }
}