#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    int answer = 0, i=1;
    if(slice<n){
        while(true){
            if(slice*i>=n){
                answer = i;
                break;
            }
            i+=1;
        }
    }
    else answer = 1;
    
    return answer;
}