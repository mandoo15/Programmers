
#include <stdbool.h>#include <stdio.h>
#include <stdlib.h>

int* solution(int money) { // 아메리카노 최대 수령 가능 수 . 잔돈 순서대로 배열
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* answer = (int*)malloc(1);
    answer[0] = money/5500;
    answer[1] = money%5500;
    return answer;
}