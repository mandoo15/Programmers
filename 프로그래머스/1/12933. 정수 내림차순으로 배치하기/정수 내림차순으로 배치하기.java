/*
정수 n의 각 자릿수를 큰 것부터 작은 순으로 정렬한 새로운 정수 리턴
ex ) 118372 -> 873211 
정수 n을 split하여 str 배열로 바꾸고, 배열을 정수형 배열 arr 저장 후 내림차순 정렬한다.
정렬한 배열을 string에 저장하고, string을 정수로 바꿔 준다.*/
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        String[] str = s.split("");
        int[] arr = new int[str.length];
        
        for(int i=0; i<str.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
            
            s = "";
            for(int i=0; i<arr.length; i++){
                s += Integer.toString(arr[i]);
            }
        
           answer = Long.parseLong(s);
        return answer;
    }
}