#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    // 초기화
    int answer = 0;
    int sum = 0;
    
    // 더하기
    for (int i = 2; i <= n; i += 2) {
        sum += i;
    }
    
    return sum;
}