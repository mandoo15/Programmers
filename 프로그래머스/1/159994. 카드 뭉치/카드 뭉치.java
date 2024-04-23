class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        for(int i=0; i<goal.length; i++){
            for(int j=0; j<cards1.length; j++){
                if(goal[i].equals(cards1[j])){
                    if(j == 0) cards1[j] = "";
                    else {
                        if(cards1[j-1].equals("")) cards1[j] = "";
                        else {
                            answer = "No";
                            break;
                        }
                    }
                }
                
                for(int k=0; k<cards2.length; k++){
                if(goal[i].equals(cards2[k])){
                    if(k == 0) cards2[j] = "";
                    else {
                        if(cards2[k-1].equals("")) cards2[k] = "";
                        else {
                            answer = "No";
                            break;
                        }
                    }
                }
            }
                
            }
        }
        return answer;
    }
}