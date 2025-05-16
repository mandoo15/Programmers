class Solution {
    public String solution(String[] survey, int[] choices) {
        int[][] cnt = new int[4][4]; // 순서대로 RT / CF / JM / AN
        for(int i=0; i<survey.length; i++){
            if(choices[i] < 4) {
                char c = survey[i].charAt(0);
                int x = 0;
                if(choices[i] == 3) x = 1;
                else if (choices[i] == 2) x = 2;
                else x = 3;
                switch(c){
                    case 'R':
                        cnt[0][0]+=x;
                        break;
                    case 'T':
                        cnt[0][1]+=x;
                        break;
                    case 'C':
                        cnt[1][0]+=x;
                        break;
                    case 'F':
                        cnt[1][1]+=x;
                        break;
                    case 'J':
                        cnt[2][0]+=x;
                        break;
                    case 'M':
                        cnt[2][1]+=x;
                        break;
                    case 'A':
                        cnt[3][0]+=x;
                        break;
                    case 'N':
                        cnt[3][1]+=x;
                        break;
                }
            }
            if(choices[i] > 4) {
                char c = survey[i].charAt(1);
                int x = 0;
                if(choices[i] == 5) x = 1;
                else if (choices[i] == 6) x = 2;
                else x = 3;
                switch(c){
                    case 'R':
                        cnt[0][0]+=x;
                        break;
                    case 'T':
                        cnt[0][1]+=x;
                        break;
                    case 'C':
                        cnt[1][0]+=x;
                        break;
                    case 'F':
                        cnt[1][1]+=x;
                        break;
                    case 'J':
                        cnt[2][0]+=x;
                        break;
                    case 'M':
                        cnt[2][1]+=x;
                        break;
                    case 'A':
                        cnt[3][0]+=x;
                        break;
                    case 'N':
                        cnt[3][1]+=x;
                        break;
                }
            }
        }
        String answer = "";
        if(cnt[0][0] >= cnt[0][1]) answer += "R";
        else answer += "T";
        
        if(cnt[1][0] >= cnt[1][1]) answer += "C";
        else answer += "F";
        
        if(cnt[2][0] >= cnt[2][1]) answer += "J";
        else answer += "M";
        
        if(cnt[3][0] >= cnt[3][1]) answer += "A";
        else answer += "N";
        
        return answer;
    }
}