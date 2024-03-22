#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
// numer - 분자 / denom - 분모 
int* solution(int numer1, int denom1, int numer2, int denom2) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int numer = numer1*denom2 + numer2*denom1; // 분자
    int denom = denom1*denom2; // 분모
    int div;
    for(int i=1; i<=denom;i++) { // 분수 약분하기
        if(numer%i==0 && denom%i==0){
            div = i;
        }
    }
    int* answer = (int*)malloc(1);
    answer[0] = numer/div;
    answer[1] = denom/div;
    return answer;
}