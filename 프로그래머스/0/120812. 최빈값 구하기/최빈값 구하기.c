#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) {
    int answer = 0;
    char index[1001] = {0}; 
    int max = 0;
    
    for(int i = 0; i < array_len; i++){
        index[array[i]]++;
        
        if(max < index[array[i]]){
            max = index[array[i]];
            answer = array[i];
        }
                
    }
    
    int count = 0;
    for(int j = 0; j < sizeof(index); j++){
        if(max == index[j]) count++;
        if(count > 1) {
            answer = -1;
            break;
        }
    }
    
    return answer;
}