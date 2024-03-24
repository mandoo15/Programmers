#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int i=1, answer = 0;;
    while(1){
        if((6*i)%n==0) {
            answer = i;
            break;
        }
        i+=1;
    }
    return answer;
}