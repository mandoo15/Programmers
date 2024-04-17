// 앞에서 부터 5명씩 묶은 그룹의 가장 앞에 서있는 사람들의 이름을 담은 리스트를 return
class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length];
        
        int cnt = 0;
        for(int i=0; i<names.length; i+=5){
            answer[cnt] = names[i];
            cnt++;
        }
        
        String[] arr = new String[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = answer[i];
        }
        return arr;
    }
}