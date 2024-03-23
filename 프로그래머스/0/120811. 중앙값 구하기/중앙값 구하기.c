#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// array_len은 배열 array의 길이입니다.
int solution(int array[], size_t array_len) { // 배열이랑 길이 제공
    int* answer = (int*)malloc(sizeof(int)*array_len); // array_len만큼 할당
    // 오름차순 정렬하기
    int temp;
    for(int i=0; i<array_len; i++){
        for(int j=0; j<array_len-1; j++){
            if(array[j] > array[j+1]){
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    } 
    answer = array[(array_len-1)/2];
    return answer;
}